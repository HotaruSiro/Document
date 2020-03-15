package ims.dto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author NAT
 */
@Entity
@Table(name = "employee")
public class Employee {

    private int MaNV;
    private String Hoten;
    private String Bidanh;
    private Gioitinh gioitinh;
    private int Didong;
    private int Dienthoainha;
    private String Diachiemail;
    private String Noisinh;
    private Date Ngaysinh;
    private int CMND;
    private Date Ngaycap;
    private String Noicap;
    private String Quequan;
    private String Diachi;
    private String Tamtru;
    private Date Ngayvaolam;
    private int Heso;
    private int Mucluongcb;
    private int Mucluong;
    private int Phucapluong;
    private int Sosolaodong;
    private Date Ngaycapsld;
    private String Noicapsld;
    private int Tknganhang;
    private String Nganhang;

    private Bangcap bangcap;
    private Chucvu chucvu;
    private Congviec congviec;
    private Dantoc dantoc;
    private Hocvan hocvan;
    private Loainhanvien loainhanvien;
    private Ngoaingu ngoaingu;
    private Phongban phongban;
    private Quoctich quoctich;
    private Tinhhoc tinhhoc;
    private Tinhthanh tinhthanh;
    private Tongiao tongiao;

    public Employee() {
    }

    public Employee(int MaNV, String Hoten, String Bidanh, Gioitinh gioitinh, int Didong, int Dienthoainha, String Diachiemail, String Noisinh, Date Ngaysinh, int CMND, Date Ngaycap, String Noicap, String Quequan, String Diachi, String Tamtru, Date Ngayvaolam, int Heso, int Mucluongcb, int Mucluong, int Phucapluong, int Sosolaodong, Date Ngaycapsld, String Noicapsld, int Tknganhang, String Nganhang, Bangcap bangcap, Chucvu chucvu, Congviec congviec, Dantoc dantoc, Hocvan hocvan, Loainhanvien loainhanvien, Ngoaingu ngoaingu, Phongban phongban, Quoctich quoctich, Tinhhoc tinhhoc, Tinhthanh tinhthanh, Tongiao tongiao) {
        this.MaNV = MaNV;
        this.Hoten = Hoten;
        this.Bidanh = Bidanh;
        this.gioitinh = gioitinh;
        this.Didong = Didong;
        this.Dienthoainha = Dienthoainha;
        this.Diachiemail = Diachiemail;
        this.Noisinh = Noisinh;
        this.Ngaysinh = Ngaysinh;
        this.CMND = CMND;
        this.Ngaycap = Ngaycap;
        this.Noicap = Noicap;
        this.Quequan = Quequan;
        this.Diachi = Diachi;
        this.Tamtru = Tamtru;
        this.Ngayvaolam = Ngayvaolam;
        this.Heso = Heso;
        this.Mucluongcb = Mucluongcb;
        this.Mucluong = Mucluong;
        this.Phucapluong = Phucapluong;
        this.Sosolaodong = Sosolaodong;
        this.Ngaycapsld = Ngaycapsld;
        this.Noicapsld = Noicapsld;
        this.Tknganhang = Tknganhang;
        this.Nganhang = Nganhang;
        this.bangcap = bangcap;
        this.chucvu = chucvu;
        this.congviec = congviec;
        this.dantoc = dantoc;
        this.hocvan = hocvan;
        this.loainhanvien = loainhanvien;
        this.ngoaingu = ngoaingu;
        this.phongban = phongban;
        this.quoctich = quoctich;
        this.tinhhoc = tinhhoc;
        this.tinhthanh = tinhthanh;
        this.tongiao = tongiao;
    }

   
   

    @Id
    @Column(name = "MaNV")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    @Column(name = "Hoten")
    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    @Column(name = "Bidanh")
    public String getBidanh() {
        return Bidanh;
    }

    public void setBidanh(String Bidanh) {
        this.Bidanh = Bidanh;
    }
 @ManyToOne
    @JoinColumn(name = "Magioitinh")
    public Gioitinh getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Gioitinh gioitinh) {
        this.gioitinh = gioitinh;    }

    @Column(name = "Didong")
    public int getDidong() {
        return Didong;
    }
    public void setDidong(int Didong) {
        this.Didong = Didong;
    }

    @Column(name = "Dienthoainha")
    public int getDienthoainha() {
        return Dienthoainha;
    }

    public void setDienthoainha(int Dienthoainha) {
        this.Dienthoainha = Dienthoainha;
    }

    @Column(name = "Diachiemail")
    public String getDiachiemail() {
        return Diachiemail;
    }

    public void setDiachiemail(String Diachiemail) {
        this.Diachiemail = Diachiemail;
    }

    @Column(name = "Noisinh")
    public String getNoisinh() {
        return Noisinh;
    }

    public void setNoisinh(String Noisinh) {
        this.Noisinh = Noisinh;
    }

    @Column(name = "Ngaysinh")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    @Column(name = "CMND")
    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    @Column(name = "Ngaycap")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getNgaycap() {
        return Ngaycap;
    }

    public void setNgaycap(Date Ngaycap) {
        this.Ngaycap = Ngaycap;
    }

    @Column(name = "Noicap")
    public String getNoicap() {
        return Noicap;
    }

    public void setNoicap(String Noicap) {
        this.Noicap = Noicap;
    }

    @Column(name = "Quequan")
    public String getQuequan() {
        return Quequan;
    }

    public void setQuequan(String Quequan) {
        this.Quequan = Quequan;
    }

    @Column(name = "Diachi")
    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    @Column(name = "Tamtru")
    public String getTamtru() {
        return Tamtru;
    }

    public void setTamtru(String Tamtru) {
        this.Tamtru = Tamtru;
    }

    @Column(name = "Ngayvaolam")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getNgayvaolam() {
        return Ngayvaolam;
    }

    public void setNgayvaolam(Date Ngayvaolam) {
        this.Ngayvaolam = Ngayvaolam;
    }

    @Column(name = "Heso")
    public int getHeso() {
        return Heso;
    }

    public void setHeso(int Heso) {
        this.Heso = Heso;
    }

    @Column(name = "Mucluongcb")
    public int getMucluongcb() {
        return Mucluongcb;
    }

    public void setMucluongcb(int Mucluongcb) {
        this.Mucluongcb = Mucluongcb;
    }

    @Column(name = "Mucluong")
    public int getMucluong() {
        return Mucluong;
    }

    public void setMucluong(int Mucluong) {
        this.Mucluong = Mucluong;
    }

    @Column(name = "Phucapluong")
    public int getPhucapluong() {
        return Phucapluong;
    }

    public void setPhucapluong(int Phucapluong) {
        this.Phucapluong = Phucapluong;
    }

    @Column(name = "Sosolaodong")
    public int getSosolaodong() {
        return Sosolaodong;
    }

    public void setSosolaodong(int Sosolaodong) {
        this.Sosolaodong = Sosolaodong;
    }

    @Column(name = "Ngaycapsld")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getNgaycapsld() {
        return Ngaycapsld;
    }

    public void setNgaycapsld(Date Ngaycapsld) {
        this.Ngaycapsld = Ngaycapsld;
    }

    @Column(name = "Noicapsld")
    public String getNoicapsld() {
        return Noicapsld;
    }

    public void setNoicapsld(String Noicapsld) {
        this.Noicapsld = Noicapsld;
    }

    @Column(name = "Tknganhang")
    public int getTknganhang() {
        return Tknganhang;
    }

    public void setTknganhang(int Tknganhang) {
        this.Tknganhang = Tknganhang;
    }

    @Column(name = "Nganhang")
    public String getNganhang() {
        return Nganhang;
    }

    public void setNganhang(String Nganhang) {
        this.Nganhang = Nganhang;
    }

    @ManyToOne
    @JoinColumn(name = "Mabangcap")

    public Bangcap getBangcap() {
        return bangcap;
    }

    public void setBangcap(Bangcap bangcap) {
        this.bangcap = bangcap;
    }

    @ManyToOne
    @JoinColumn(name = "Machucvu")

    public Chucvu getChucvu() {
        return chucvu;
    }

    public void setChucvu(Chucvu chucvu) {
        this.chucvu = chucvu;
    }

    @ManyToOne
    @JoinColumn(name = "Macongviec")

    public Congviec getCongviec() {
        return congviec;
    }

    public void setCongviec(Congviec congviec) {
        this.congviec = congviec;
    }

    @ManyToOne
    @JoinColumn(name = "Madantoc")

    public Dantoc getDantoc() {
        return dantoc;
    }

    public void setDantoc(Dantoc dantoc) {
        this.dantoc = dantoc;
    }

    @ManyToOne
    @JoinColumn(name = "Mahocvan")

    public Hocvan getHocvan() {
        return hocvan;
    }

    public void setHocvan(Hocvan hocvan) {
        this.hocvan = hocvan;
    }

    @ManyToOne
    @JoinColumn(name = "Mangoaingu")

    public Ngoaingu getNgoaingu() {
        return ngoaingu;
    }

    public void setNgoaingu(Ngoaingu ngoaingu) {
        this.ngoaingu = ngoaingu;
    }

    @ManyToOne
    @JoinColumn(name = "Maphongban")

    public Phongban getPhongban() {
        return phongban;
    }

    public void setPhongban(Phongban phongban) {
        this.phongban = phongban;
    }

    @ManyToOne
    @JoinColumn(name = "Maquoctich")

    public Quoctich getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(Quoctich quoctich) {
        this.quoctich = quoctich;
    }

    @ManyToOne
    @JoinColumn(name = "Matinhoc")
    public Tinhhoc getTinhhoc() {
        return tinhhoc;
    }

    public void setTinhhoc(Tinhhoc tinhhoc) {
        this.tinhhoc = tinhhoc;
    }

    @ManyToOne
    @JoinColumn(name = "Matinhthanh")

    public Tinhthanh getTinhthanh() {
        return tinhthanh;
    }

    public void setTinhthanh(Tinhthanh tinhthanh) {
        this.tinhthanh = tinhthanh;
    }
  @ManyToOne
    @JoinColumn(name = "Maloainv")

public Loainhanvien getLoainhanvien() {
        return loainhanvien;
    }

    public void setLoainhanvien(Loainhanvien loainhanvien) {
        this.loainhanvien = loainhanvien;
    }
    @ManyToOne
    @JoinColumn(name = "Matongiao")
    public Tongiao getTongiao() {
        return tongiao;
    }
    public void setTongiao(Tongiao tongiao) {
        this.tongiao = tongiao;
    }
}
