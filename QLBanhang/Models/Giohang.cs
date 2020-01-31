using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using QLBanhang.Models;
namespace QLBanhang.Models
{
    public class Giohang
    {

        dbQLBanhangDataContext db = new dbQLBanhangDataContext();
        public int iMaMH { set; get; }
        public string sTenMH { set; get; }
        public string sXuatxu { set; get; }
        public string sAnhbia { set; get; }
        public Double dDongia { set; get; }
        public int iSoluong { set; get; }
        public int iDungtich { set; get; }
        public int iDungtich1 { set; get; }
        public int iDungtich2 { set; get; }
        public int iDungtich3 { set; get; }
        public int iKhuyenmai { set; get; }

        public Double dThanhtien
        {
            get
            {
                if (iKhuyenmai == 0)
                {
                    return iSoluong * dDongia;
                }
                else
                {
                    return dThanhtienKM;
                }
            }
        }
        public Double dTienKM
        {
            get { return dDongia - ((dDongia * iKhuyenmai) / 100); }
        }
        public Double dThanhtienKM
        {
            get { return iSoluong * dTienKM; }
        }
        public Giohang(int MaMH)
        {
            iMaMH = MaMH;
            MATHANG mh = db.MATHANGs.Single(n => n.MaMH == iMaMH);
            sTenMH = mh.TenMH;
            sXuatxu = mh.Xuatxu;
            sAnhbia = mh.Anhbia;
            dDongia = double.Parse(mh.Giaban.ToString());
            iSoluong = 1;
            if (mh.Dungtich1 != null)
            {
                iDungtich1 = int.Parse(mh.Dungtich1.ToString());
            }
            if (mh.Dungtich2 != null)
            {
                iDungtich2 = int.Parse(mh.Dungtich2.ToString());
            }
            if (mh.Dungtich3 != null)
            {
                iDungtich3 = int.Parse(mh.Dungtich3.ToString());
            }
            if (mh.Khuyenmai != null)
            {
                iKhuyenmai = int.Parse(mh.Khuyenmai.ToString());
            }
        }
    }
}