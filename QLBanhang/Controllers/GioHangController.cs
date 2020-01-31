using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using QLBanhang.Models;

namespace QLBanhang.Controllers
{
    public class GioHangController : Controller
    {
        // GET: GioHang
        dbQLBanhangDataContext db = new dbQLBanhangDataContext();

        public List<Giohang> Laygiohang()
        {
            List<Giohang> lstGiohang = Session["Giohang"] as List<Giohang>;
            if (lstGiohang == null)
            {
                lstGiohang = new List<Giohang>();
                Session["Giohang"] = lstGiohang;
            }
            return lstGiohang;
        }
        public ActionResult ThemGiohang(int iMaMH, string strURL)
        {
            List<Giohang> lstGiohang = Laygiohang();
            Giohang sanpham = lstGiohang.Find(n => n.iMaMH == iMaMH);
            if (sanpham == null)
            {
                sanpham = new Giohang(iMaMH);
                lstGiohang.Add(sanpham);
                return Redirect(strURL);
            }
            else
            {
                sanpham.iSoluong++;
                return Redirect(strURL);
            }
        }
        public int TongSoLuong()
        {
            int iTongSoLuong = 0;
            List<Giohang> lstGiohang = Session["GioHang"] as List<Giohang>;
            if (lstGiohang != null)
            {
                iTongSoLuong = lstGiohang.Sum(n => n.iSoluong);
            }
            return iTongSoLuong;
        }
        public double Tongtien()
        {
            double iTongTien = 0;
            List<Giohang> lstGiohang = Session["GioHang"] as List<Giohang>;
            if (lstGiohang != null)
            {
                iTongTien = lstGiohang.Sum(n => n.dThanhtien);
            }
            return iTongTien;
        }
        public ActionResult GioHang()
        {
            List<Giohang> lstGiohang = Laygiohang();
            if (lstGiohang.Count == 0)
            {
                return RedirectToAction("Index", "Hang");
            }
            ViewBag.Tongsoluong = TongSoLuong();
            ViewBag.Tongtien = Tongtien();
            return View(lstGiohang);
        }
        public ActionResult ReviewGioHang()
        {
            List<Giohang> lstGiohang = Laygiohang();
            if (lstGiohang.Count == 0)
            {
                ViewBag.s = false;
            }
            ViewBag.Tongsoluong = TongSoLuong();
            ViewBag.Tongtien = Tongtien();
            return View(lstGiohang);
        }
        public ActionResult XoaGiohang(int iMaSP)
        {
            List<Giohang> lstGiohang = Laygiohang();
            Giohang sanpham = lstGiohang.SingleOrDefault(n => n.iMaMH == iMaSP);
            if (sanpham != null)
            {
                lstGiohang.RemoveAll(n => n.iMaMH == iMaSP);
                return RedirectToAction("GioHang");
            }
            if (lstGiohang.Count == 0)
            {
                return RedirectToAction("Index", "Hang");
            }
            return RedirectToAction("GioHang");
        }
        public ActionResult XoaTatcaGiohang()
        {
            List<Giohang> lstGiohang = Laygiohang();
            lstGiohang.Clear();
            return RedirectToAction("Index", "Hang");
        }

        //public ActionResult xacnhantonkho(int iMaSP, FormCollection f)
        //{
        //    List<Giohang> lstGiohang = Laygiohang();
        //    Tonkho tonkho = db.Tonkhos.SingleOrDefault(n => n.MaMH == iMaSP);
        //    Giohang sanpham = lstGiohang.SingleOrDefault(n => n.iMaMH == iMaSP);
        //    sanpham.iDungtich = int.Parse(f["txtDungtich"].ToString());
        //        if (sanpham.iDungtich > tonkho.Slton)
        //        {
        //        ViewBag.Thongbao = "Vượt quá số lượng tồn, tồn kho còn lại là : " + tonkho.Slton;
        //        }

        //    return View();
        //}

        public ActionResult CapnhatGiohang(int iMaSP, FormCollection f)
        {
            List<Giohang> lstGiohang = Laygiohang();
            Giohang sanpham = lstGiohang.SingleOrDefault(n => n.iMaMH == iMaSP);
            if (sanpham != null)
            {
                sanpham.iDungtich = int.Parse(f["txtDungtich"].ToString());
                sanpham.iSoluong = int.Parse(f["txtSoluong"].ToString());
            }
            return RedirectToAction("Giohang");
        }
        [HttpGet]

        public ActionResult DatHang()
        {           
            List<Giohang> lstGiohang = Laygiohang();
            ViewBag.Tongsoluong = TongSoLuong();
            ViewBag.Tongtien = Tongtien();
            return View(lstGiohang);
        }
        [HttpPost]
        public ActionResult DatHang(FormCollection collection)
        {
            DONDATHANG ddh = new DONDATHANG();
            KHACHHANG kh = (KHACHHANG)Session["Taikhoan"];
            List<Giohang> gh = Laygiohang();
            if (Session["Taikhoan"] == null || Session["Taikhoan"].ToString() == "")
            {
                ddh.MaKH = 1;
                ddh.TenNgDat = collection["TenNgDat"];
                ddh.DiaChiGiao = collection["DiaChiGiao"];
                ddh.SDT = collection["SDT"];
            }
            else
            {
                ddh.MaKH = kh.MaKH;
            }
            ddh.Ngaydat = DateTime.Now;
            var ngaygiao = String.Format("{0:MM/dd/yyyy}", collection["Ngaygiao"]);
            ddh.Ngaygiao = DateTime.Parse(ngaygiao);
            ddh.Tinhtranggiaohang = false;
            ddh.Dathanhtoan = false;
            db.DONDATHANGs.InsertOnSubmit(ddh);
            db.SubmitChanges();
            foreach (var item in gh)
            {
                    CTDONHANG ctdh = new CTDONHANG();
                    ctdh.MaDDH = ddh.MaDDH;
                    ctdh.MaMH = item.iMaMH;
                    ctdh.Soluong = item.iSoluong;
                    ctdh.Dongia = (decimal)item.dTienKM;
                    ctdh.Dungtich = item.iDungtich;
                    db.CTDONHANGs.InsertOnSubmit(ctdh);
            }
            db.SubmitChanges();
            Session["Giohang"] = null;
            return RedirectToAction("Xacnhandonhang", "Giohang");
        }
        public ActionResult Xacnhandonhang()
        {
            return View();
        }
    }
}