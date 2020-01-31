using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using PagedList;
using QLBanhang.Models;
namespace QLBanhang.Controllers
{
    public class HangController : Controller
    {
        // GET: Hang
        dbQLBanhangDataContext data = new dbQLBanhangDataContext();
        private List<MATHANG> laymhmoi(int count)
        {
            return data.MATHANGs.OrderByDescending(a => a.Ngaycapnhap).Take(count).ToList();
        }

        public ActionResult Index2(FormCollection tk)
        {
            var mathang = laymhmoi(100);
            return View(mathang);
        }

        private List<MATHANG> laymhit(int count)
        {
            return/* data.MATHANGs.OrderBy(a => a.Ngaycapnhap).Take(count).ToList();*/
            (from p in data.MATHANGs
             orderby p.Soluongton ascending
             select p).Take(count).ToList();
        }

        public ActionResult Index1(FormCollection tk)
        {
            var mathang = laymhit(20);
            return View(mathang);
        }

        public ActionResult Index3(FormCollection tk)
        {
            var mathang = laymhit(5);
            return View(mathang);
        }

        public ActionResult Xem_them(int? page, FormCollection tk)
        {
            //Tao bien quy dinh so san pham tren moi trang
            int pageSize = 9;
            //Tao bien so trang
            int pageNum = (page ?? 1);
            string name = tk["txtname"];
            if (name != null && name != "")
            {
                List<MATHANG> mathang = (from p in data.MATHANGs where p.TenMH.ToUpper().Contains(name.ToUpper()) orderby p.MaMH descending select p).Take(100).ToList();
                if (mathang.Count == 0)
                {
                    return RedirectToAction("timkiemnull");
                }
                else
                {
                    return View(mathang.ToPagedList(pageNum, pageSize));
                }
            }
            else
            {
                var mathang = laymhmoi(1000);
                return View(mathang.ToPagedList(pageNum, pageSize));
            }

        }
        
        public ActionResult Index()
        {
            var mathang = laymhmoi(100);
            return View(mathang);
        }
       
        public ActionResult Details(int id)
        {
            var hang = from s in data.MATHANGs
                       where s.MaMH == id
                       select s;
            return View(hang.Single());
        }
        /////////////////////////
        public ActionResult Chude()
        {
            var chude = from cd in data.CHUDEs select cd;
            return PartialView(chude);
        }
        public ActionResult NhaCU()
        {
            var nhacungung = from ncu in data.NHACUNGUNGs select ncu;
            return PartialView(nhacungung);
        }
        public ActionResult SPTheochude(int? page, int id)
        {
            int pageSize = 6;
            //Tao bien so trang
            int pageNum = (page ?? 1);
            var hang = from s in data.MATHANGs where s.MaCD == id select s;

            return View(hang.ToPagedList(pageNum, pageSize));
        }
        public ActionResult SPTheoNCU(int? page, int id)
        {
            int pageSize = 6;
            //Tao bien so trang
            int pageNum = (page ?? 1);
            var hang = from s in data.MATHANGs where s.MaNCC == id select s;
            return View(hang.ToPagedList(pageNum, pageSize));

        }
        public ActionResult timkiemnull()
        {
            return View();
        }
        public ActionResult SlideIndex()
        {
                var slideIndex = from sIndex in data.SlideIndexes select sIndex;
                return View(slideIndex);
        }
        public ActionResult SlideMini()
        {
            var slideMini = from sIndex in data.SlideIndexes select sIndex;
            return View(slideMini);
        }
        public ActionResult Images(int? page)
        {
            int pageSize = 24;
            int pageNum = (page ?? 1);
            var image = from sImage in data.Images orderby sImage.Date descending select sImage;
            return View(image.ToPagedList(pageNum, pageSize));
        }
        public ActionResult ImagesWith(int? page, int id)
        {
            int pageSize = 12;
            //Tao bien so trang
            int pageNum = (page ?? 1);
            var imagesWith = from s in data.Images where s.MaMH == id select s;
            return View(imagesWith.ToPagedList(pageNum, pageSize));
        }
    }
}