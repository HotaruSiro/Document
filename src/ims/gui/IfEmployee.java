/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import ims.dto.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author NAT
 */
public class IfEmployee extends JDialog {

    /**
     * Creates new form Employee
     */
    private Employee employee;
    private List<Bangcap> listBangcap;
    private List<Chucvu> listChucvu;
    private List<Congviec> listCongviec;
    private List<Dantoc> listDantoc;
    private List<Hocvan> listHocvan;
    private List<Gioitinh> listGioitinh;
    private List<Loainhanvien> listLoainhanvien;
    private List<Ngoaingu> listNgoaingu;
    private List<Phongban> listPhongban;
    private List<Quoctich> listQuoctich;
    private List<Tinhhoc> listTinhhoc;
    private List<Tinhthanh> listTinhthanh;
    private List<Tongiao> listTongiao;

    public IfEmployee() {

    }

    public IfEmployee(Frame owner) {
        super(owner, true);
        initComponents();
        setTitle("Create Product");
        setInfoDialog();
    }

    public void setEmployee(Employee employee) {
        setTitle("Edit Employee");
        this.employee = employee;
        //Item item = (Item)cmbgioitinh.getSelectedItem();
        txtmanv.setText(String.valueOf(employee.getMaNV()));
        txthoten.setText(employee.getHoten());
        txtbidanh.setText(employee.getBidanh());
        cmbgioitinh.setSelectedIndex(employee.getGioitinh().getMagioitinh()-1);
        txtiididong.setText(String.valueOf(employee.getDidong()));
        txtdienthoainha.setText(String.valueOf(employee.getDienthoainha()));
        txtemail.setText(employee.getDiachiemail());
        //    SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
        dtNgaysinh.setDate(employee.getNgaysinh());
        txtNoisinh.setText(employee.getNoisinh());
        Tinhthanh t = employee.getTinhthanh();
        cmbtinhthanh.setSelectedIndex(employee.getTinhthanh().getMatinhthanh()-1);
        txtcmnd.setText(String.valueOf(employee.getCMND()));
        dtNgaycap.setDate(employee.getNgaycap());
        txtNoicap.setText(employee.getNoicap());
        txtquequan.setText(employee.getQuequan());
        txtdiachi.setText(employee.getDiachi());
        txttamtru.setText(employee.getTamtru());
        cmbloainv.setSelectedIndex(employee.getLoainhanvien().getMaloainv()-1);
        dtNgayvao.setDate(employee.getNgayvaolam());
        cmbphongban.setSelectedIndex(employee.getPhongban().getMaphongban()-1);
        cmbcongviec.setSelectedIndex(employee.getCongviec().getMacongviec()-1);
        cmbchucvu.setSelectedIndex(employee.getChucvu().getMachucvu()-1);
        txtmucluongcb.setText(String.valueOf(employee.getMucluongcb()));
        txtheso.setText(String.valueOf(employee.getHeso()));
        txtmucluong.setText(String.valueOf(employee.getMucluong()));
        txtluongphucap.setText(String.valueOf(employee.getPhucapluong()));
        txtsolaodong.setText(String.valueOf(employee.getSosolaodong()));
        dtNgaycapsld.setDate(employee.getNgaycapsld());
        txtnoicapsld.setText(employee.getNoicapsld());

        txtsotknganhang.setText(String.valueOf(employee.getTknganhang()));
        txtnganhang.setText(employee.getNganhang());
        cmbhocvan.setSelectedIndex(employee.getHocvan().getMahocvan()-1);
        cmbbangcap.setSelectedIndex(employee.getBangcap().getMabangcap()-1);
        cmbngoaingu.setSelectedIndex(employee.getNgoaingu().getMangoaingu()-1);
        cmbtinhoc.setSelectedIndex(employee.getTinhhoc().getMatinhoc()-1);
        cmbdantoc.setSelectedIndex(employee.getDantoc().getMadantoc()-1);
        cmbquoctich.setSelectedIndex(employee.getQuoctich().getMaquoctich()-1);
        cmbtongiao.setSelectedIndex(employee.getTongiao().getMatongiao()-1);
    }

    public void setListBangcap(List<Bangcap> listBangcap) {
        this.listBangcap = listBangcap;
        for (Bangcap bangcap : listBangcap) {
            cmbbangcap.addItem(bangcap);
        }
    }

    public void setListChucvu(List<Chucvu> listChucvu) {
        this.listChucvu = listChucvu;
        for (Chucvu chucvu : listChucvu) {
            cmbchucvu.addItem(chucvu);
        }
    }

    public void setListCongviec(List<Congviec> listCongviec) {
        this.listCongviec = listCongviec;
        for (Congviec congviec : listCongviec) {
            cmbcongviec.addItem(congviec);
        }
    }

    public void setListDantoc(List<Dantoc> listDantoc) {
        this.listDantoc = listDantoc;
        for (Dantoc dantoc : listDantoc) {
            cmbdantoc.addItem(dantoc);
        }
    }

    public void setListHocvan(List<Hocvan> listHocvan) {
        this.listHocvan = listHocvan;
        for (Hocvan hocvan : listHocvan) {
            cmbhocvan.addItem(hocvan);
        }
    }

    public void setListGioitinh(List<Gioitinh> listGioitinh) {
        this.listGioitinh = listGioitinh;
        for (Gioitinh gioitinh : listGioitinh) {
            cmbgioitinh.addItem(gioitinh);
        }
    }

    public void setListLoainhanvien(List<Loainhanvien> listLoainhanvien) {
        this.listLoainhanvien = listLoainhanvien;
        for (Loainhanvien loainhanvien : listLoainhanvien) {
            cmbloainv.addItem(loainhanvien);
        }
    }

    public void setListNgoaingu(List<Ngoaingu> listNgoaingu) {
        this.listNgoaingu = listNgoaingu;
        for (Ngoaingu ngoaingu : listNgoaingu) {
            cmbngoaingu.addItem(ngoaingu);
        }
    }

    public void setListPhongban(List<Phongban> listPhongban) {
        this.listPhongban = listPhongban;
        for (Phongban phongban : listPhongban) {
            cmbphongban.addItem(phongban);
        }
    }

    public void setListQuoctich(List<Quoctich> listQuoctich) {
        this.listQuoctich = listQuoctich;
        for (Quoctich quoctich : listQuoctich) {
            cmbquoctich.addItem(quoctich);
        }
    }

    public void setListTinhhoc(List<Tinhhoc> listTinhhoc) {
        this.listTinhhoc = listTinhhoc;
        for (Tinhhoc tinhhoc : listTinhhoc) {
            cmbtinhoc.addItem(tinhhoc);
        }
    }

    public void setListTinhthanh(List<Tinhthanh> listTinhthanh) {
        this.listTinhthanh = listTinhthanh;
        for (Tinhthanh tinhthanh : listTinhthanh) {
            cmbtinhthanh.addItem(tinhthanh);
        }
    }

    public void setListTongiao(List<Tongiao> listTongiao) {
        this.listTongiao = listTongiao;
        for (Tongiao tongiao : listTongiao) {
            cmbtongiao.addItem(tongiao);
        }
    }

    public void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);
        setResizable(false);
    }

    public Employee getEmployee() {
        return employee;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtmanv = new javax.swing.JTextField();
        txtcmnd = new javax.swing.JTextField();
        txtquequan = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txttamtru = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtdienthoainha = new javax.swing.JTextField();
        txtbidanh = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        cmbtinhthanh = new javax.swing.JComboBox<>();
        txtiididong = new javax.swing.JTextField();
        dtNgaysinh = new com.toedter.calendar.JDateChooser();
        dtNgaycap = new com.toedter.calendar.JDateChooser();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        panelthongtincv = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtheso = new javax.swing.JTextField();
        txtmucluong = new javax.swing.JTextField();
        txtnganhang = new javax.swing.JTextField();
        cmbhocvan = new javax.swing.JComboBox();
        cmbngoaingu = new javax.swing.JComboBox();
        cmbphongban = new javax.swing.JComboBox();
        cmbchucvu = new javax.swing.JComboBox();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        cmbtinhoc = new javax.swing.JComboBox();
        cmbbangcap = new javax.swing.JComboBox();
        cmbdantoc = new javax.swing.JComboBox();
        cmbquoctich = new javax.swing.JComboBox();
        cmbtongiao = new javax.swing.JComboBox();
        cmbcongviec = new javax.swing.JComboBox();
        cmbloainv = new javax.swing.JComboBox();
        txtmucluongcb = new javax.swing.JTextField();
        txtsolaodong = new javax.swing.JTextField();
        txtsotknganhang = new javax.swing.JTextField();
        txtluongphucap = new javax.swing.JTextField();
        dtNgayvao = new com.toedter.calendar.JDateChooser();
        dtNgaycapsld = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNoisinh = new javax.swing.JTextField();
        txtNoicap = new javax.swing.JTextField();
        cmbgioitinh = new javax.swing.JComboBox();
        txtnoicapsld = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/images/Save.png"))); // NOI18N
        btSave.setText("Ghi");
        btSave.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btSave.setPreferredSize(new java.awt.Dimension(75, 23));
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/images/logoutSmall.png"))); // NOI18N
        btCancel.setText("Hủy");
        btCancel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btCancel.setPreferredSize(new java.awt.Dimension(85, 23));
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        jLabel53.setText("Mã Nhân Viên");

        jLabel52.setText("Di Động");
        jLabel52.setPreferredSize(new java.awt.Dimension(65, 14));

        jLabel67.setForeground(java.awt.Color.red);
        jLabel67.setText("(*)");

        jLabel54.setText("Ngày Sinh");

        jLabel55.setText("CMND");

        jLabel56.setText("Quê Quán");

        jLabel57.setText("Địa Chỉ");

        jLabel58.setText("Tạm Trú");

        jLabel59.setText("Họ Tên");

        jLabel68.setForeground(java.awt.Color.red);
        jLabel68.setText("(*)");

        jLabel60.setText("Điện Thoại Nhà");

        jLabel61.setText("Nơi Sinh");

        jLabel64.setText("Giới tính");

        jLabel65.setText("Email");

        jLabel66.setText("Tỉnh Thành");

        jLabel9.setText("Ngày Cấp");

        jLabel13.setText("Nơi Cấp");

        txtmanv.setEnabled(false);
        txtmanv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanvActionPerformed(evt);
            }
        });

        txtdienthoainha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdienthoainhaActionPerformed(evt);
            }
        });

        txtiididong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtiididongActionPerformed(evt);
            }
        });

        jLabel62.setText("THÔNG TIN NHÂN VIÊN");

        jLabel63.setText("THÔNG TIN CÔNG VIỆC");

        panelthongtincv.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Loại Nhân Viên");

        jLabel2.setText("Công Việc");

        jLabel3.setText("Dân Tộc");

        jLabel4.setText("Mức Lương CB");

        jLabel5.setText("Số Sổ Lao Động");

        jLabel6.setText("TK.Ngân Hàng");

        jLabel7.setText("Học Vấn");

        jLabel8.setText("Ngày Cấp");

        jLabel10.setText("Hệ Số");

        jLabel11.setText("Quốc Tịch");

        jLabel12.setText("Ngoại Ngữ");

        jLabel16.setText("Ngày vào");

        jLabel17.setText("Phòng Ban");

        jLabel18.setText("Chức Vụ");

        jLabel19.setText("Mức Lương");

        jLabel20.setText("Nơi Cấp");

        jLabel21.setText("Ngân Hàng");

        jLabel22.setText("Bằng Cấp");

        jLabel23.setText("Tin Học");

        jLabel24.setText("Tôn Giáo");

        jLabel25.setText("Phụ Cấp Lương");

        cmbphongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbphongbanActionPerformed(evt);
            }
        });

        jLabel69.setForeground(java.awt.Color.red);
        jLabel69.setText("(*)");

        jLabel70.setForeground(java.awt.Color.red);
        jLabel70.setText("(*)");

        jLabel71.setForeground(java.awt.Color.red);
        jLabel71.setText("(*)");

        jLabel74.setForeground(java.awt.Color.red);
        jLabel74.setText("(*)");

        jLabel75.setForeground(java.awt.Color.red);
        jLabel75.setText("(*)");

        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setText("(*)");

        jLabel15.setForeground(java.awt.Color.red);
        jLabel15.setText("(*)");

        txtNoisinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoisinhActionPerformed(evt);
            }
        });

        jLabel72.setText("Bí Danh");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(452, 452, 452)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel67)
                .addGap(6, 6, 6)
                .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtbidanh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtiididong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtdienthoainha, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cmbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(dtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtNoisinh, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cmbtinhthanh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(dtNgaycap, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtNoicap, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtquequan, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txttamtru, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(539, 539, 539)
                .addComponent(panelthongtincv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel69))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(cmbloainv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel14))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(dtNgayvao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel74))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(cmbphongban, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel70)
                .addGap(6, 6, 6)
                .addComponent(cmbcongviec, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel75))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(cmbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(txtmucluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15)))
                .addGap(11, 11, 11)
                .addComponent(txtheso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtmucluong, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel25)
                .addGap(17, 17, 17)
                .addComponent(txtluongphucap, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtsolaodong, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dtNgaycapsld, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtnoicapsld, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtsotknganhang, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtnganhang, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(cmbhocvan, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cmbbangcap, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(cmbngoaingu, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(cmbtinhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(cmbdantoc, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(cmbquoctich, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(cmbtongiao, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(620, 620, 620)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel62)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel67)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59)
                    .addComponent(jLabel68)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(txtbidanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel64)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtiididong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(txtdienthoainha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbgioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54)
                    .addComponent(dtNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(txtNoisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(cmbtinhthanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(dtNgaycap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtNoicap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(txtquequan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(txttamtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel63)
                .addGap(2, 2, 2)
                .addComponent(panelthongtincv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addComponent(jLabel1)
                    .addComponent(cmbloainv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(dtNgayvao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(jLabel17)
                    .addComponent(cmbphongban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel70)
                    .addComponent(cmbcongviec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel18)
                    .addComponent(cmbchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel71)
                    .addComponent(jLabel4)
                    .addComponent(txtmucluongcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(txtheso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtmucluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtluongphucap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtsolaodong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(dtNgaycapsld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtnoicapsld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtsotknganhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtnganhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cmbhocvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(cmbbangcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cmbngoaingu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cmbtinhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmbdantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cmbquoctich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(cmbtongiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected boolean validateInput() {
        //  int manv=Integer.parseInt(txtmanv.getText());
        String hoten = txthoten.getText();
        String bidanh = txtbidanh.getText();
        // String gioitinh = .getText();
        Object selectedItemGT = cmbgioitinh.getSelectedItem();
        //  int didong = Integer.parseInt(txtiididong.getText());
        String didong = txtiididong.getText();
        //int dienthoainha = Integer.parseInt(txtdienthoainha.getText());
        String dienthoainha = txtdienthoainha.getText();
        String diachiemail = txtemail.getText();
        Date dateNS = dtNgaysinh.getDate();
        String noisinh = txtNoisinh.getText();
        Object selectedItemTT = cmbtinhthanh.getSelectedItem();
        //int cmnd = Integer.parseInt(txtcmnd.getText());
        String cmnd = txtcmnd.getText();
        Date dateNC = dtNgaycap.getDate();
        String noicap = txtNoicap.getText();
        String quequan = txtquequan.getText();
        String diachi = txtdiachi.getText();
        String tamtru = txttamtru.getText();
        Object selectedItemLNV = cmbloainv.getSelectedItem();
        Date dateNVL = dtNgayvao.getDate();
        Object selectedItemPB = cmbphongban.getSelectedItem();
        Object selectedItemViec = cmbcongviec.getSelectedItem();
        Object selectedItemCV = cmbchucvu.getSelectedItem();
        //double mucluongcb = Integer.parseInt(txtmucluongcb.getText());
        String mucluongcb = txtmucluongcb.getText();
        //int heso =  Integer.parseInt(txtheso.getText());
        String heso = txtheso.getText();
        //double mucluong =  Integer.parseInt(txtmucluong.getText());
        String mucluong = txtmucluong.getText();
        //double phucapluong =  Integer.parseInt(txtluongphucap.getText());
        String phucapluong = txtluongphucap.getText();
        //int sosolaodong =  Integer.parseInt(txtsolaodong.getText());
        String sosolaodong = txtsolaodong.getText();
        Date dateNCsld = dtNgaycapsld.getDate();
        String noicapsld = txtnoicapsld.getText();
        //double tknganhang =  Integer.parseInt(txtsotknganhang.getText());
        String tknganhang = txtsotknganhang.getText();
        String nganhang = txtnganhang.getText();
        Object selectedItemhv = cmbhocvan.getSelectedItem();
        Object selectedItembc = cmbbangcap.getSelectedItem();
        Object selectedItemnn = cmbngoaingu.getSelectedItem();
        Object selectedItemth = cmbtinhoc.getSelectedItem();
        Object selectedItemdt = cmbdantoc.getSelectedItem();
        Object selectedItemqt = cmbquoctich.getSelectedItem();
        Object selectedItemtg = cmbtongiao.getSelectedItem();
        int employeedd = 0;
        int employeedtnha = 0;
        int employeecmnd = 0;
        int employeeluongcb = 0;
        int employeeluong = 0;
        int employeeheso = 0;
        int employeephucapluong = 0;
        int employeesosld = 0;
        int employeetknganhang = 0;
        if (hoten.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập họ tên");
            txthoten.requestFocus();
            return false;
        } else if (bidanh.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập bí danh");
            txtbidanh.requestFocus();
            return false;
        } else if (selectedItemGT == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để trống giới tính");
            return false;
        } else if (didong.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại");
            txtiididong.requestFocus();
            return false;

        } else if (dienthoainha.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số đt nhà");
            txtdienthoainha.requestFocus();
            return false;
        } else if (diachiemail.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập email");
            txtemail.requestFocus();
            return false;
        }
        try {
            //employeeAge = Integer.parseInt(age);
            employeedd = Integer.parseInt(didong);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "số điện thoại di động phải là số");
            txtiididong.requestFocus();
            return false;
        }
        try {
            employeedtnha = Integer.parseInt(dienthoainha);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "số điện thoại nhà phải là số");
            txtdienthoainha.requestFocus();
            return false;
        }
        try {
                            employeecmnd = Integer.parseInt(cmnd);
           
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "CMND phải là số");
            txtcmnd.requestFocus();
            return false;
        }
        try {
            employeeheso = Integer.parseInt(heso);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "hệ số phải là số");
            txtheso.requestFocus();
            return false;
        }
        try {
            employeeluong = Integer.parseInt(mucluong);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "lương phải là số");
            txtmucluong.requestFocus();
            return false;
        }try {
                              employeeluongcb = Integer.parseInt(mucluongcb);
            
      
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "lương cơ bản phải là số");
            txtmucluongcb.requestFocus();
            return false;
        }
        try {
            employeephucapluong = Integer.parseInt(phucapluong);
       
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "lương phụ cấp phải là số");
            txtluongphucap.requestFocus();
            return false;
        }
        try {
                 employeetknganhang = Integer.parseInt(tknganhang);
       
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "tk ngân hàng phải là số");
            txtsotknganhang.requestFocus();
            return false;
        }
        try {
                 employeesosld = Integer.parseInt(sosolaodong);
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "số sổ lao động phải là số");
            txtsolaodong.requestFocus();
            return false;
        }

        if (employee == null) {
            employee = new Employee();
        }
        //employee.setMaNV(manv);
        employee.setHoten(hoten);
        employee.setBidanh(bidanh);
        employee.setGioitinh((Gioitinh) selectedItemGT);
        employee.setDidong(employeedd);
        employee.setDienthoainha(employeedtnha);
        employee.setDiachiemail(diachiemail);
        employee.setNgaysinh(dateNS);
        employee.setNoisinh(noisinh);
        employee.setTinhthanh((Tinhthanh) selectedItemTT);
        employee.setCMND(employeecmnd);
        employee.setNgaycap(dateNC);
        employee.setNoicap(noicap);
        employee.setQuequan(quequan);
        employee.setDiachi(diachi);
        employee.setTamtru(tamtru);
        employee.setLoainhanvien((Loainhanvien) selectedItemLNV);
        employee.setNgayvaolam(dateNVL);
        employee.setPhongban((Phongban) selectedItemPB);
        employee.setCongviec((Congviec) selectedItemViec);
        employee.setChucvu((Chucvu) selectedItemCV);
        employee.setMucluongcb(employeeluongcb);
        employee.setHeso(employeeheso);
        employee.setMucluong(employeeluong);
        employee.setPhucapluong(employeephucapluong);
        employee.setSosolaodong(employeesosld);
        employee.setNgaycapsld(dateNCsld);
        employee.setNoicapsld(noicapsld);
        employee.setTknganhang(employeetknganhang);
        employee.setNganhang(nganhang);
        employee.setHocvan((Hocvan) selectedItemhv);
        employee.setBangcap((Bangcap) selectedItembc);
        employee.setNgoaingu((Ngoaingu) selectedItemnn);
        employee.setTinhhoc((Tinhhoc) selectedItemth);
        employee.setDantoc((Dantoc) selectedItemdt);
        employee.setQuoctich((Quoctich) selectedItemqt);
        employee.setTongiao((Tongiao) selectedItemtg);
        return true;
    }
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if (validateInput()) {
            dispose();
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void txtmanvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanvActionPerformed

    private void txtdienthoainhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdienthoainhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdienthoainhaActionPerformed

    private void txtNoisinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoisinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoisinhActionPerformed

    private void cmbphongbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbphongbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbphongbanActionPerformed

    private void txtiididongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtiididongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtiididongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new IfEmployee().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox cmbbangcap;
    private javax.swing.JComboBox cmbchucvu;
    private javax.swing.JComboBox cmbcongviec;
    private javax.swing.JComboBox cmbdantoc;
    private javax.swing.JComboBox cmbgioitinh;
    private javax.swing.JComboBox cmbhocvan;
    private javax.swing.JComboBox cmbloainv;
    private javax.swing.JComboBox cmbngoaingu;
    private javax.swing.JComboBox cmbphongban;
    private javax.swing.JComboBox cmbquoctich;
    private javax.swing.JComboBox cmbtinhoc;
    private javax.swing.JComboBox<Tinhthanh> cmbtinhthanh;
    private javax.swing.JComboBox cmbtongiao;
    private com.toedter.calendar.JDateChooser dtNgaycap;
    private com.toedter.calendar.JDateChooser dtNgaycapsld;
    private com.toedter.calendar.JDateChooser dtNgaysinh;
    private com.toedter.calendar.JDateChooser dtNgayvao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelthongtincv;
    private javax.swing.JTextField txtNoicap;
    private javax.swing.JTextField txtNoisinh;
    private javax.swing.JTextField txtbidanh;
    private javax.swing.JTextField txtcmnd;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtdienthoainha;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtheso;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtiididong;
    private javax.swing.JTextField txtluongphucap;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtmucluong;
    private javax.swing.JTextField txtmucluongcb;
    private javax.swing.JTextField txtnganhang;
    private javax.swing.JTextField txtnoicapsld;
    private javax.swing.JTextField txtquequan;
    private javax.swing.JTextField txtsolaodong;
    private javax.swing.JTextField txtsotknganhang;
    private javax.swing.JTextField txttamtru;
    // End of variables declaration//GEN-END:variables
}
