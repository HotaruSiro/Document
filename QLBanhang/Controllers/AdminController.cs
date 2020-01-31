using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using QLBanhang.Models;
using System.IO;
using PagedList;

namespace QLBanhang.Controllers
{

    public class AdminController : Controller
    {
        dbQLBanhangDataContext db = new dbQLBanhangDataContext();
        // GET: Admin

        public ActionResult Index()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            return View();

        }
        public ActionResult Hang(int? page)
        {

            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            int pageNumber = (page ?? 1);
            int pageSize = 6;
            ////return View(db.MATHANGs.ToList());
            return View(db.MATHANGs.ToList().OrderByDescending(n => n.Ngaycapnhap).ToPagedList(pageNumber, pageSize));
        }
        public ActionResult Donhang(int? page)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            int pageNumber = (page ?? 1);
            int pageSize = 10;
            ////return View(db.MATHANGs.ToList());
            return View(db.hoadons.ToList().OrderByDescending(n => n.Ngaydat).ToPagedList(pageNumber, pageSize));
        }
        public ActionResult Chude()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            return View(db.CHUDEs.ToList());
        }
        [HttpGet]
        public ActionResult XoaCD(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            CHUDE chude = db.CHUDEs.SingleOrDefault(n => n.MaCD == id);
            ViewBag.MaCD = chude.MaCD;
            if (chude == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(chude);
        }
        [HttpPost, ActionName("XoaCD")]
        public ActionResult XacnhanxoaCD(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            CHUDE chude = db.CHUDEs.SingleOrDefault(n => n.MaCD == id);
            ViewBag.MaCD = chude.MaCD;
            if (chude == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            db.CHUDEs.DeleteOnSubmit(chude);
            db.SubmitChanges();
            return RedirectToAction("Chude");
        }
        [HttpGet]
        public ActionResult ThemmoiCD()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            return View();
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult ThemmoiCD(CHUDE hang)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Luu vao CSDL
            db.CHUDEs.InsertOnSubmit(hang);
            db.SubmitChanges();

            return RedirectToAction("Chude");

        }
        [HttpGet]
        public ActionResult SuaCD(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach theo ma
            CHUDE sach = db.CHUDEs.SingleOrDefault(n => n.MaCD == id);
            ViewBag.Masach = sach.MaCD;
            if (sach == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(sach);
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult SuaCD(CHUDE sach)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            CHUDE hang = db.CHUDEs.SingleOrDefault(n => n.MaCD == sach.MaCD);
            var TenChuDe = sach.TenChuDe;
            hang.TenChuDe = TenChuDe;
            db.SubmitChanges();
            return RedirectToAction("Chude");

        }
        public ActionResult NCU()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            return View(db.NHACUNGUNGs.ToList());
        }
        [HttpGet]
        public ActionResult ThemmoiNCU()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            return View();
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult ThemmoiNCU(NHACUNGUNG hang)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Luu vao CSDL
            db.NHACUNGUNGs.InsertOnSubmit(hang);
            db.SubmitChanges();
            return RedirectToAction("NCU");
        }
        [HttpGet]
        public ActionResult XoaNCU(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            NHACUNGUNG chude = db.NHACUNGUNGs.SingleOrDefault(n => n.MaNCC == id);
            ViewBag.MaCD = chude.MaNCC;
            if (chude == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(chude);
        }
        [HttpPost, ActionName("XoaNCU")]
        public ActionResult XacnhanxoaNCU(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            NHACUNGUNG chude = db.NHACUNGUNGs.SingleOrDefault(n => n.MaNCC == id);
            ViewBag.MaCD = chude.MaNCC;
            if (chude == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            db.NHACUNGUNGs.DeleteOnSubmit(chude);
            db.SubmitChanges();
            return RedirectToAction("NCU");
        }
        [HttpGet]
        public ActionResult SuaNCU(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach theo ma
            NHACUNGUNG sach = db.NHACUNGUNGs.SingleOrDefault(n => n.MaNCC == id);
            ViewBag.Masach = sach.MaNCC;
            if (sach == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(sach);
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult SuaNCU(NHACUNGUNG sach)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            NHACUNGUNG hang = db.NHACUNGUNGs.SingleOrDefault(n => n.MaNCC == sach.MaNCC);
            hang.TenNCC = sach.TenNCC;
            hang.Diachi = sach.Diachi;
            hang.Dienthoai = sach.Dienthoai;
            db.SubmitChanges();
            return RedirectToAction("NCU");
        }
        public ActionResult Kachhang(int? page)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            int pageNumber = (page ?? 1);
            int pageSize = 10;
            ////return View(db.MATHANGs.ToList());
            return View(db.KHACHHANGs.ToList().OrderByDescending(n => n.MaKH).ToPagedList(pageNumber, pageSize));
        }
        [HttpGet]
        public ActionResult Login()
        {
            return View();
        }
        [HttpPost]
        public ActionResult Login(FormCollection collection)
        {
            var tendn = collection["username"];
            var matkhau = collection["password"];
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
                Admin ad = db.Admins.SingleOrDefault(n => n.UserAdmin == tendn && n.PassAdmin == matkhau);
                if (ad != null)
                {
                    Session["Taikhoanadmin"] = ad;
                    return RedirectToAction("Index", "Admin");
                }
                else
                    ViewBag.Thongbao = "Tên đăng nhập hoặc mật khẩu không đúng!";
            }
            return View();
        }
        [HttpGet]
        public ActionResult ThemmoiMH()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Dua du lieu vao dropdownList
            //Lay ds tu tabke chu de, sắp xep tang dan trheo ten chu de, chon lay gia tri Ma CD, hien thi thi Tenchude
            ViewBag.MaCD = new SelectList(db.CHUDEs.ToList().OrderBy(n => n.TenChuDe), "MaCD", "TenChude");
            ViewBag.MaNCC = new SelectList(db.NHACUNGUNGs.ToList().OrderBy(n => n.TenNCC), "MaNCC", "TenNCC");
            return View();
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult ThemmoiMH(MATHANG hang, HttpPostedFileBase fileUpload)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Dua du lieu vao dropdownload
            ViewBag.MaCD = new SelectList(db.CHUDEs.ToList().OrderBy(n => n.TenChuDe), "MaCD", "TenChude");
            ViewBag.MaNCC = new SelectList(db.NHACUNGUNGs.ToList().OrderBy(n => n.TenNCC), "MaNCC", "TenNCC");
            //Kiem tra duong dan file
            if (fileUpload == null)
            {
                ViewBag.Thongbao = "Vui lòng chọn ảnh bìa";
                return View();
            }
            //Them vao CSDL
            else
            {
                if (ModelState.IsValid)
                {
                    //Luu ten fie, luu y bo sung thu vien using System.IO;
                    var fileName = Path.GetFileName(fileUpload.FileName);
                    //Luu duong dan cua file
                    var path = Path.Combine(Server.MapPath("~/Hinhanh"), fileName);
                    //Kiem tra hình anh ton tai chua?
                    if (System.IO.File.Exists(path))
                        ViewBag.Thongbao = "Hình ảnh đã tồn tại";
                    else
                    {
                        //Luu hinh anh vao duong dan
                        fileUpload.SaveAs(path);
                    }
                    hang.Anhbia = fileName;
                    //Luu vao CSDL
                    db.MATHANGs.InsertOnSubmit(hang);
                    db.SubmitChanges();
                }
                return RedirectToAction("Hang");
            }
        }
        //Hiển thị sản phẩm
        public ActionResult ChitietMH(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach theo ma
            MATHANG hang = db.MATHANGs.SingleOrDefault(n => n.MaMH == id);
            ViewBag.MaMH = hang.MaMH;
            if (hang == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(hang);
        }
        //Xóa sản phẩm
        [HttpGet]
        public ActionResult XoaMH(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            MATHANG hang = db.MATHANGs.SingleOrDefault(n => n.MaMH == id);
            ViewBag.MaMH = hang.MaMH;
            if (hang == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(hang);
        }
        [HttpPost, ActionName("XoaMH")]
        public ActionResult Xacnhanxoa(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            MATHANG hang = db.MATHANGs.SingleOrDefault(n => n.MaMH == id);
            ViewBag.MaMH = hang.MaMH;
            if (hang == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            db.MATHANGs.DeleteOnSubmit(hang);
            db.SubmitChanges();
            return RedirectToAction("Hang");
        }
        [HttpGet]
        public ActionResult XoaDH(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            CTDONHANG hang = db.CTDONHANGs.FirstOrDefault(n => n.MaDDH == id);
            ViewBag.MaDDH = hang.MaDDH;
            if (hang == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(hang);
        }
        [HttpPost, ActionName("XoaDH")]
        public ActionResult XacnhanxoaDH(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            CTDONHANG hang = db.CTDONHANGs.FirstOrDefault(n => n.MaDDH == id);
            ViewBag.MaDDH = hang.MaDDH;
            if (hang == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            db.CTDONHANGs.DeleteOnSubmit(hang);
            db.SubmitChanges();
            return RedirectToAction("Donhang");
        }


        [HttpGet]
        public ActionResult sua_don_hang(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach theo ma
            DONDATHANG ddh = db.DONDATHANGs.SingleOrDefault(n => n.MaDDH == id);
            if (ddh == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(ddh);
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult sua_don_hang(DONDATHANG ddh)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }

            DONDATHANG dondh = db.DONDATHANGs.SingleOrDefault(n => n.MaDDH == ddh.MaDDH);
            dondh.Dathanhtoan = ddh.Dathanhtoan;
            dondh.Tinhtranggiaohang = ddh.Tinhtranggiaohang;
            db.SubmitChanges();
            return RedirectToAction("Donhang");

        }

        public ActionResult tim_kiem_don_hang_(int? page, FormCollection tk)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            int pageSize = 100;
            //Tao bien so trang
            int pageNum = (page ?? 1);
            string name = tk["txtname"];
            if (name != null && name != "")
            {
                List<CTDONHANG> mathang = (from p in db.CTDONHANGs where (p.MaDDH.ToString().Contains(name)) orderby p.MaDDH descending select p).Take(100).ToList();
                if (mathang.Count == 0)
                {
                    return RedirectToAction("ket_qua_tim_kiem_");
                }
                else
                {
                    return View(mathang.ToPagedList(pageNum, pageSize));
                }
            }
            else
            {
                return RedirectToAction("Donhang");
            }
        }
        public ActionResult tim_kiem_mat_hang_(int? page, FormCollection tk)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Tao bien quy dinh so san pham tren moi trang
            int pageSize = 6;
            //Tao bien so trang
            int pageNum = (page ?? 1);
            string name = tk["txtname"];
            if (name != null && name != "")
            {
                List<MATHANG> mathang = (from p in db.MATHANGs where p.TenMH.ToUpper().Contains(name.ToUpper()) orderby p.MaMH descending select p).Take(100).ToList();
                if (mathang.Count == 0)
                {
                    return RedirectToAction("ket_qua_tim_kiem_");
                }
                else
                {
                    return View(mathang.ToPagedList(pageNum, pageSize));
                }
            }
            else
            {
                return RedirectToAction("Hang");
            }

        }
        public ActionResult ket_qua_tim_kiem_()
        {
            return View();
        }
        //Chinh sửa sản phẩm
        [HttpGet]
        public string getImage(int id)
        {
            return db.MATHANGs.SingleOrDefault(n => n.MaMH == id).Anhbia;
        }
        public ActionResult SuaMH(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach theo ma
            MATHANG hang = db.MATHANGs.SingleOrDefault(n => n.MaMH == id);
            ViewBag.MaMH = hang.MaMH;
            if (hang == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            //Dua du lieu vao dropdownList
            //Lay ds tu tabke chu de, sắp xep tang dan trheo ten chu de, chon lay gia tri Ma CD, hien thi thi Tenchude
            ViewBag.MaCD = new SelectList(db.CHUDEs.ToList().OrderBy(n => n.TenChuDe), "MaCD", "TenChude", hang.MaCD);
            ViewBag.MaNCC = new SelectList(db.NHACUNGUNGs.ToList().OrderBy(n => n.TenNCC), "MaNCC", "TenNCC", hang.MaNCC);
            return View(hang);
        }
        [HttpPost]
        [ValidateInput(false)]
        [ValidateAntiForgeryToken]
        public ActionResult SuaMH(MATHANG mATHANG, HttpPostedFileBase fileUpload)
        {
            MATHANG hang = db.MATHANGs.SingleOrDefault(n => n.MaMH == mATHANG.MaMH);
            hang.MaMH = mATHANG.MaMH;
            hang.TenMH = mATHANG.TenMH;
            hang.Giaban = mATHANG.Giaban;
            hang.Mota = mATHANG.Mota;
            hang.Anhphu1 = mATHANG.Anhphu1;
            hang.Anhphu2 = mATHANG.Anhphu2;
            hang.Anhphu3 = mATHANG.Anhphu3;
            hang.Cachdung = mATHANG.Cachdung;
            hang.Xuatxu = mATHANG.Xuatxu;
            hang.Ngaycapnhap = mATHANG.Ngaycapnhap;
            hang.Soluongton = mATHANG.Soluongton;
            hang.Mac = mATHANG.Mac;
            hang.Thanhtoantructuyen = mATHANG.Thanhtoantructuyen;
            hang.Khuyenmai = mATHANG.Khuyenmai;
            hang.Dungtich1 = mATHANG.Dungtich1;
            hang.Dungtich2 = mATHANG.Dungtich2;
            hang.Dungtich3 = mATHANG.Dungtich3;

         
            if (ModelState.IsValid)
            {
                //Dua du lieu vao dropdownload
                //ViewBag.MaCD = new SelectList(db.CHUDEs.ToList().OrderBy(n => n.TenChuDe), "MaCD", "TenChude", mATHANG.MaCD);
                //ViewBag.MaNCC = new SelectList(db.NHACUNGUNGs.ToList().OrderBy(n => n.TenNCC), "MaNCC", "TenNCC", mATHANG.MaNCC);
                hang.MaCD = mATHANG.MaCD;
                hang.MaNCC = mATHANG.MaNCC;

                if (fileUpload == null)
                {
                    hang.Anhbia = getImage(mATHANG.MaMH);
                }
                //Them vao CSDL
                else
                {
                    if (ModelState.IsValid)
                    {
                        //Luu ten fie, luu y bo sung thu vien using System.IO;
                        var fileName = Path.GetFileName(fileUpload.FileName);
                        //Luu duong dan cua file
                        var path = Path.Combine(Server.MapPath("~/Hinhanh"), fileName);
                        //Kiem tra hình anh ton tai chua?
                        if (System.IO.File.Exists(path))
                        {
                            mATHANG.Anhbia = fileName;
                            ViewBag.Thongbao = "Hình ảnh đã tồn tại";
                            return View(mATHANG);
                        }
                        else
                        {
                            //Luu hinh anh vao duong dan
                            fileUpload.SaveAs(path);
                            hang.Anhbia = fileName;
                        }
                    }
                }
                db.SubmitChanges();
            }
            return RedirectToAction("Hang");
        }
        public ActionResult Dangxuat()
        {
            Session["Taikhoanadmin"] = null;
            return Redirect("/");
        }
        public ActionResult Slider()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            return View(db.SlideIndexes.ToList());
        }
        [HttpGet]
        public string getSlider(int id)
        {
            return db.SlideIndexes.SingleOrDefault(n => n.ID == id).Slide;
        }
        public ActionResult SuaSlider(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong theo ma
            SlideIndex slideIndex = db.SlideIndexes.SingleOrDefault(n => n.ID == id);
            ViewBag.Masach = slideIndex.ID;
            if (slideIndex == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(slideIndex);
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult SuaSlider(SlideIndex slideIndex, HttpPostedFileBase fileUpload)
        {
            SlideIndex slide = db.SlideIndexes.SingleOrDefault(n => n.ID == slideIndex.ID);
            if (slideIndex.ID == 1 || slideIndex.ID == 12)
            {
                slide.Slide_1 = slideIndex.Slide_1;
                slide.Slide_2 = slideIndex.Slide_2;
                slide.Slide_3 = slideIndex.Slide_3;
                slide.Slide_4 = slideIndex.Slide_4;
                slide.Slide_5 = slideIndex.Slide_5;
                slide.Slide_6 = slideIndex.Slide_6;
            }
            else
            {
                if (fileUpload == null)
                {
                    slide.Slide = getSlider(slideIndex.ID);
                }
                //Them vao CSDL
                else
                {
                    if (ModelState.IsValid)
                    {
                        //Luu ten fie, luu y bo sung thu vien using System.IO;
                        var fileName = Path.GetFileName(fileUpload.FileName);
                        //Luu duong dan cua file
                        var path = Path.Combine(Server.MapPath("~/slide"), fileName);
                        //Kiem tra hình anh ton tai chua?
                        if (System.IO.File.Exists(path))
                        {
                            System.IO.File.Delete(path);
                        }
                        //Luu hinh anh vao duong dan
                        fileUpload.SaveAs(path);
                        slide.Slide = fileName;
                    }
                }
            }
            db.SubmitChanges();
            return RedirectToAction("Slider");
        }

        public ActionResult xem_images()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            return View(db.Images.ToList());
        }
        [HttpGet]
        public ActionResult xoa_image(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            Image images = db.Images.SingleOrDefault(n => n.ID == id);
            if (images == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            return View(images);
        }
        [HttpPost, ActionName("xoa_image")]
        public ActionResult xac_nhan_xoa_image(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach can xoa theo ma
            Image ig = db.Images.SingleOrDefault(n => n.ID == id);
            if (ig == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            db.Images.DeleteOnSubmit(ig);
            db.SubmitChanges();
            return RedirectToAction("xem_images");
        }
        [HttpGet]
        public ActionResult them_image()
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            ViewBag.MaMH = new SelectList(db.MATHANGs.ToList().OrderBy(n => n.TenMH), "MaMH", "TenMH");
            return View();
        }
        [HttpPost]
        [ValidateInput(false)]
        public ActionResult them_image(Image img)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            ViewBag.MaMH = new SelectList(db.MATHANGs.ToList().OrderBy(n => n.TenMH), "MaMH", "TenMH");
            //Luu vao CSDL
            db.Images.InsertOnSubmit(img);
            db.SubmitChanges();

            return RedirectToAction("xem_images");

        }
        public ActionResult sua_image(int id)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Lay ra doi tuong sach theo ma
            Image img = db.Images.SingleOrDefault(n => n.ID == id);
            if (img == null)
            {
                Response.StatusCode = 404;
                return null;
            }
            //Dua du lieu vao dropdownList
            ViewBag.MaMH = new SelectList(db.MATHANGs.ToList().OrderBy(n => n.TenMH), "MaMH", "TenMH", img.MaMH);
            return View(img);
        }
        [HttpPost]
        [ValidateInput(false)]
        [ValidateAntiForgeryToken]
        public ActionResult sua_image(Image img)
        {
            Image ig = db.Images.SingleOrDefault(n => n.ID == img.ID);
            ig.Name_Image = img.Name_Image;
            ig.Id_image = img.Id_image;
            ig.Date = img.Date;
            if (ModelState.IsValid)
            {
                ////Dua du lieu vao dropdownload
                //ViewBag.MaMH = new SelectList(db.MATHANGs.ToList().OrderBy(n => n.TenMH), "MaMH", "TenMH");
                ig.MaMH = img.MaMH;
                db.SubmitChanges();
            }
            return RedirectToAction("xem_images");
        }
        public ActionResult tim_kiem_images(int? page, FormCollection tk)
        {
            if (Session["Taikhoanadmin"] == null || Session["Taikhoanadmin"].ToString() == "")
            {
                return RedirectToAction("Login");
            }
            //Tao bien quy dinh so san pham tren moi trang
            int pageSize = 6;
            //Tao bien so trang
            int pageNum = (page ?? 1);
            string name = tk["txtname"];
            if (name != null && name != "")
            {
                List<Image> mathang = (from p in db.Images where p.Name_Image.ToUpper().Contains(name.ToUpper()) orderby p.ID descending select p).Take(100).ToList();
                if (mathang.Count == 0)
                {
                    return RedirectToAction("ket_qua_tim_kiem_");
                }
                else
                {
                    return View(mathang.ToPagedList(pageNum, pageSize));
                }
            }
            else
            {
                return RedirectToAction("xem_images");
            }

        }
    }
}