using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using QLBanhang.Models;


namespace QLBanhang.Controllers
{
    public class NguoidungController : Controller
    {
        // GET: Nguoidung
        dbQLBanhangDataContext db = new dbQLBanhangDataContext();
        public ActionResult Index()
        {
            return View();
        }
        [HttpGet]
        public ActionResult Dangky()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Dangky(FormCollection collection, KHACHHANG kh, HttpPostedFileBase fileUpload)
        {

            var hoten = collection["HotenKH"];
            var tendn = collection["TenDN"];
            var matkhau = collection["Matkhau"];
            var matkhaunhaplai = collection["Matkhaunhaplai"];
            var diachi = collection["Diachi"];
            var email = collection["Email"];
            var dienthoai = collection["Dienthoai"];
            var ngaysinh = String.Format("{0:MM/dd/yyyy}", collection["Ngaysinh"]);
            if (String.IsNullOrEmpty(hoten))
            {
                ViewData["Loi1"] = "Họ tên khách hàng không được để trống";
            }
            else
            if (String.IsNullOrEmpty(tendn))
            {
                ViewData["Loi2"] = "Phải nhập tên đăng nhập";
            }
            else
            if (String.IsNullOrEmpty(matkhau))
            {
                ViewData["Loi3"] = "Phải nhập mật khẩu";
            }
            else
            if (String.IsNullOrEmpty(matkhaunhaplai))
            {
                ViewData["Loi4"] = "Phải nhập lại mật khẩu";
            }
            if (String.IsNullOrEmpty(diachi))
            {
                ViewData["Loi7"] = "Dia chi không được bỏ trống";
            }
            if (String.IsNullOrEmpty(email))
            {
                ViewData["Loi5"] = "Email không được bỏ trống";
            }
            if (String.IsNullOrEmpty(dienthoai))
            {
                ViewData["Loi6"] = "Phải nhập số điện thoại";
            }
            else
            {
                kh.HoTen = hoten;
                kh.Taikhoan = tendn;
                kh.Matkhau = matkhau;
                kh.Email = email;
                kh.DiachiKH = diachi;
                kh.DienthoaiKH = dienthoai;
                kh.Ngaysinh = DateTime.Parse(ngaysinh);

                db.KHACHHANGs.InsertOnSubmit(kh);
                db.SubmitChanges();
                return View();

            }
            return this.Dangky();

        }

        [HttpGet]
        public ActionResult Dangnhap()
        {
            return View();
        }
        public ActionResult Dangxuat()
        {
            Session["Taikhoan"] = null;
            return Redirect("/");
        }
        [HttpPost]
        public ActionResult Dangnhap(FormCollection collection)
        {
            var tendn = collection["TenDN"];
            var matkhau = collection["Matkhau"];
            if (String.IsNullOrEmpty(tendn))
            {
                ViewData["Loi1"] = "Phải nhập tên đăng nhập";
            }
            else if (String.IsNullOrEmpty(matkhau))
            {
                ViewData["Loi2"] = "Phải nhập mật khẩu";
            }
            else
            {
                KHACHHANG kh = db.KHACHHANGs.SingleOrDefault(n => n.Taikhoan == tendn && n.Matkhau == matkhau);
                if (kh != null)
                {
                    Session["Taikhoan"] = kh;
                    return RedirectToAction("Giohang", "Giohang");
                    //Response.Redirect("GioHang/Giohang");
                  
                }
                else
                {
                    ViewBag.Thongbao = "Tên đăng nhập hoặc mật khẩu không đúng";
                }
            }
            return View();
        }
        public ActionResult profile()
        {
            if (Session["Taikhoan"] == null || Session["Taikhoan"].ToString() == "")
            {
                return RedirectToAction("Dangnhap", "Nguoidung");
            }
            return View((KHACHHANG)Session["Taikhoan"]);
        }
        [HttpGet]
        public ActionResult Suainf(int id)
        {
            if (Session["Taikhoan"] == null || Session["Taikhoan"].ToString() == "")
            {
                return RedirectToAction("Dangnhap", "Nguoidung");
            }
            //Lay ra doi tuong sach theo ma
            KHACHHANG sach = db.KHACHHANGs.SingleOrDefault(n => n.MaKH == id);
            ViewBag.Masach = sach.MaKH;
            if (sach == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(sach);
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult Suainf(KHACHHANG sach)
        {

            KHACHHANG kh = db.KHACHHANGs.SingleOrDefault(n => n.MaKH == sach.MaKH);
            var HoTen = sach.HoTen;
            var Taikhoan = sach.Taikhoan;
            var Ngaysinh = sach.Ngaysinh;
            var DienthoaiKH = sach.DienthoaiKH;
            var Email = sach.Email;
            var DiachiKH = sach.DiachiKH;
            var Matkhau = sach.Matkhau;
            kh.HoTen = HoTen;
            kh.Taikhoan = Taikhoan;
            kh.Ngaysinh = Ngaysinh;
            kh.DienthoaiKH = DienthoaiKH;
            kh.Email = Email;
            kh.DiachiKH = DiachiKH;
            kh.Matkhau = Matkhau;

            db.SubmitChanges();
            return RedirectToAction("Dangxuat");
        }
        public ActionResult DangnhapGH()
        {
            KHACHHANG kh = (KHACHHANG)Session["Taikhoan"];
            if (Session["Taikhoan"] == null)
            {
                ViewBag.dd = "ĐĂNG NHẬP";
            }

            else
            {
                ViewBag.LO = "Thoát";
                ViewBag.inf = "Thông tin cá nhân";
                ViewBag.LOGI = "Xin Chào," + kh.HoTen;


            }
            return PartialView();
        }

    }
}