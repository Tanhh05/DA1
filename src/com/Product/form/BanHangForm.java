package com.Product.form;

import Jframe.ThongTinKhachHangJFrame;
import com.Product.main.Main;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.entity.HoaDon;
import main.repository.HoaDonChiTietRepository;
import main.repository.HoaDonRepository;
import main.repository.SanPhamChiTietRepository;
import main.response.HoaDonChiTietReponse;
import main.response.HoaDonResponse;
import main.response.HoaDonResponse1;
import main.response.SanPhamChiTietRespone;

public class BanHangForm extends javax.swing.JPanel {

    private SanPhamChiTietRepository sanPhamChiTietRepository;
    
    private DefaultTableModel dtmSanPham;
    
    private HoaDonRepository hoaDonRepository;
    
    private DefaultTableModel dtmHoaDonChiTiet;
    
    private DefaultTableModel dtmHoaDon;
    
    private HoaDonChiTietRepository hoaDonChiTietRepository;
    
    private Integer indexHoaDonSelected;
    
    public BanHangForm() {
        initComponents();
        setOpaque(false);
        
        sanPhamChiTietRepository = new SanPhamChiTietRepository();
        
        hoaDonRepository = new HoaDonRepository();
        
        hoaDonChiTietRepository = new HoaDonChiTietRepository();
        
        dtmSanPham = (DefaultTableModel) tb_SP.getModel();
        
        dtmHoaDon = (DefaultTableModel) tb_hoaDon.getModel();
        
        dtmHoaDonChiTiet = (DefaultTableModel) tb_hoaDonChiTiet.getModel();
        
        showTableSanPham(sanPhamChiTietRepository.getAll());
        
        showTableHoaDon(hoaDonRepository.getAllByStatus());
        
        indexHoaDonSelected = tb_hoaDon.getSelectedRow();
    }

    private void showTableSanPham(ArrayList<SanPhamChiTietRespone> lists) {
        dtmSanPham.setRowCount(0);
        AtomicInteger index = new AtomicInteger(1);
        lists.forEach(s -> dtmSanPham.addRow(new Object[]{
            index.getAndIncrement(), s.getMaSPCT(),s.getTenSP(),
            s.getPhongCach(),s.getXuatXu(),s.getKichThuoc(),s.getSoLuong(),s.getGiaBan() 
        }));
    }

    private void showTableHoaDon(ArrayList<HoaDonResponse1> lists) {
        dtmHoaDon.setRowCount(0);
        AtomicInteger index = new AtomicInteger(1);
        lists.forEach(s -> dtmHoaDon.addRow(new Object[]{
            index.getAndIncrement(), s.getMaHoaDon(),s.getNgayTao(),s.getMaNhanVien(),s.getTongTien()+"₫",s.getTrangThai()==0?"Chua thanh toan":"Da Thanh Toan"
        }));
    }
    
    private void showTableHoaDonChiTiet(ArrayList<HoaDonChiTietReponse> lists) {
        dtmHoaDonChiTiet.setRowCount(0);
        AtomicInteger index = new AtomicInteger(1);
        lists.forEach(s -> dtmHoaDonChiTiet.addRow(new Object[]{
            index.getAndIncrement(), s.getMaSPCT(),s.getThuongHieu(),s.getMauSac(),s.getCoAo(),s.getKichThuoc(),
            s.getGiaBan()+"₫",s.getSoLuong(),s.getThanhTien()+"₫"
        }));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        buttonBadges1 = new com.Product.swing.ButtonBadges();
        buttonBadges2 = new com.Product.swing.ButtonBadges();
        buttonBadges3 = new com.Product.swing.ButtonBadges();
        jScrollPane4 = new javax.swing.JScrollPane();
        tb_hoaDon = new com.Product.GUI.Table();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buttonBadges4 = new com.Product.swing.ButtonBadges();
        textField2 = new com.Product.GUI.textfield.TextField();
        textField1 = new com.Product.GUI.textfield.TextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_maHoaDon = new com.Product.GUI.textfield.TextField();
        txt_khachHang = new com.Product.GUI.textfield.TextField();
        txt_maNhanVien = new com.Product.GUI.textfield.TextField();
        combobox3 = new com.Product.GUI.Combobox();
        jLabel2 = new javax.swing.JLabel();
        buttonBadges5 = new com.Product.swing.ButtonBadges();
        buttonBadges6 = new com.Product.swing.ButtonBadges();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_tongTien1 = new javax.swing.JLabel();
        txt_tongTien = new javax.swing.JTextField();
        textField8 = new com.Product.GUI.textfield.TextField();
        textField10 = new com.Product.GUI.textfield.TextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combobox2 = new com.Product.GUI.Combobox();
        txt_ngayTT = new com.Product.GUI.textfield.TextField();
        jPanel6 = new javax.swing.JPanel();
        textField6 = new com.Product.GUI.textfield.TextField();
        textField9 = new com.Product.GUI.textfield.TextField();
        textField12 = new com.Product.GUI.textfield.TextField();
        textField11 = new com.Product.GUI.textfield.TextField();
        textField3 = new com.Product.GUI.textfield.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_SP = new com.Product.GUI.Table();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tb_hoaDonChiTiet = new com.Product.GUI.Table();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Bán Hàng");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        buttonBadges1.setBackground(new java.awt.Color(255, 204, 153));
        buttonBadges1.setText("Quét QR Sản Phẩm");
        buttonBadges1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        buttonBadges2.setBackground(new java.awt.Color(255, 204, 153));
        buttonBadges2.setText("Tạo Hóa Đơn ");
        buttonBadges2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonBadges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges2ActionPerformed(evt);
            }
        });

        buttonBadges3.setBackground(new java.awt.Color(255, 204, 51));
        buttonBadges3.setText("Làm Mới");
        buttonBadges3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        tb_hoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Ma Hóa Ðon", "Ngày Tao", "Nhân Viên", "Tông Tiên", "Trang Thai"
            }
        ));
        tb_hoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mcl(evt);
            }
        });
        jScrollPane4.setViewportView(tb_hoaDon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(buttonBadges3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonBadges3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 170, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đơn Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 0, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 255))); // NOI18N

        buttonBadges4.setBackground(new java.awt.Color(255, 153, 153));
        buttonBadges4.setText("Chọn");
        buttonBadges4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBadges4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges4ActionPerformed(evt);
            }
        });

        textField2.setText("Khách Bán Lẻ");
        textField2.setLabelText("");

        textField1.setText("KH001");
        textField1.setLabelText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBadges4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBadges4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Hóa Đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Mã Hóa Đơn");

        txt_maHoaDon.setLabelText("Mã Hóa Đơn");

        txt_khachHang.setLabelText("");

        txt_maNhanVien.setLabelText("");

        combobox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Tổng");

        buttonBadges5.setBackground(new java.awt.Color(255, 153, 153));
        buttonBadges5.setText("Hủy");
        buttonBadges5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        buttonBadges6.setBackground(new java.awt.Color(255, 153, 153));
        buttonBadges6.setText("Thanh Toán");
        buttonBadges6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBadges6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges6ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Ngày Thanh Toán");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mã Nhân Viên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tên Khách Hàng");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Phiếu giảm giá");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Hình thức thanh toán");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Tiền khách đưa");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Tiền khách CK");

        txt_tongTien1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_tongTien1.setForeground(new java.awt.Color(255, 51, 0));
        txt_tongTien1.setText("0 VND");

        textField8.setLabelText("");
        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });

        textField10.setLabelText("");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Tiền thừa");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Tổng Tiền");

        combobox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox2ActionPerformed(evt);
            }
        });

        txt_ngayTT.setLabelText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(buttonBadges5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonBadges6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_tongTien1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(txt_maHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_khachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ngayTT, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_maHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ngayTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(txt_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_khachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(combobox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10))
                    .addComponent(textField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_tongTien1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonBadges5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(buttonBadges6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        textField3.setLabelText("Tìm Kiếm");

        tb_SP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Ma SPCT", "Tên SP", "Danh Muc", "Xuat Xu", "Size", "SL Tôn", "Ðon Giá"
            }
        ));
        tb_SP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_SPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_SP);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField12, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 174, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tb_hoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Ma SPCT", "Ten SP", "Màu Sac", "Cô Áo", "Size", "Giá Bán", "Sô Luong", "Thành Tien"
            }
        ));
        jScrollPane5.setViewportView(tb_hoaDonChiTiet);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combobox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox2ActionPerformed

    private void combobox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox3ActionPerformed

    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed

    private void buttonBadges2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges2ActionPerformed
        // TODO add your handling code here:
        HoaDon hd = HoaDon.builder()
                .khachHangID(1) 
                .nhanVienID(1) 
                .build();
        // B2: Add hd vao bang hd trong CSDL 
        hoaDonRepository.add(hd);
        // B3: Load lai table hoa don 
        showTableHoaDon(hoaDonRepository.getAllByStatus());
    }//GEN-LAST:event_buttonBadges2ActionPerformed

    private void mcl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcl
        // TODO add your handling code here:
        indexHoaDonSelected = tb_hoaDon.getSelectedRow();
        HoaDonResponse1 response1 = hoaDonRepository.getAllByStatus().get(indexHoaDonSelected);
        txt_maHoaDon.setText(response1.getMaHoaDon());
        txt_maNhanVien.setText(response1.getMaNhanVien());
        txt_khachHang.setText(response1.getTenKhachHang());
        txt_tongTien.setText(response1.getTongTien()+"₫");
        txt_tongTien1.setText(response1.getTongTien()+"₫");
        txt_ngayTT.setText(response1.getNgayTao());
        showTableHoaDonChiTiet(hoaDonChiTietRepository.getAll(response1.getId()));
    }//GEN-LAST:event_mcl

    private void tb_SPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_SPMouseClicked
        // TODO add your handling code here:
        int row = tb_SP.getSelectedRow();
        // Lay ra doi tuong SPCT dang chon
        SanPhamChiTietRespone spctr = sanPhamChiTietRepository.getAll().get(row);
        // Check ID/ Ma cua SPCT (cai dang chon)co ton tai trong bang HDCT cua hoa don dang chon hay k ?
       
        // Lay ra hoa don dang selected 
        HoaDonResponse1 response1 = hoaDonRepository.getAllByStatus().get(indexHoaDonSelected);

        // add vao list hoa don chi tiet 
        // hien thi ra o input diglog de nguoi dung nhap gia tri vao 
        String soLuong = JOptionPane.showInputDialog("So luong la ", "0");

        // Tao ra hoa don chi tiet
        HoaDonChiTietReponse hoaDonChiTietResponse
                = HoaDonChiTietReponse.builder()
                        .idHoaDon(response1.getId())
                        .idSpct(spctr.getID())
                        .maSPCT(spctr.getMaSPCT())
                        .thuongHieu(spctr.getThuongHieu())
                        .xuatXu(spctr.getXuatXu())
                        .mauSac(spctr.getMauSac())
                        .kichThuoc(spctr.getKichThuoc())
                        .chatLieu(spctr.getChatLieu())
                        .coAo(spctr.getCoAo())
                        .doDay(spctr.getDoDay())
                        .phongCach(spctr.getPhongCach())
                        .giaBan(spctr.getGiaBan())
                        .soLuong(Integer.valueOf(soLuong))
                        .trangThai(spctr.isTrangThai())
                        .thanhTien(Integer.valueOf(soLuong) * spctr.getGiaBan())
                        .build();
        System.out.println(hoaDonChiTietResponse);
        // add tam vao list hdct
        hoaDonChiTietRepository.getAll(response1.getId()).add(hoaDonChiTietResponse);
        // update so luong san pham cua doi tuong vua chon 
        spctr.setSoLuong(spctr.getSoLuong() - Integer.valueOf(soLuong));
        // Update so luong vao DB 
        sanPhamChiTietRepository.updateSoLuong(spctr);
        // Them vao hdct trong CSDL 
        hoaDonChiTietRepository.add(hoaDonChiTietResponse);

        // load laij table hdct & table sp 
        showTableSanPham(sanPhamChiTietRepository.getAll());
        showTableHoaDonChiTiet(hoaDonChiTietRepository.getAll(response1.getId()));
        

        // Cap nhat tt ben phai 
        response1.setTongTien(showTotalMoney(hoaDonChiTietRepository.getAllKK(response1.getId())));
        txt_tongTien.setText(response1.getTongTien()+ ""); // update tong tien ben phai
        // Update tong tien vao trong  CSDL cua bang Hoa don
        hoaDonRepository.updateTongTien(response1.getTongTien(), response1.getId());
        // show lai table hoa don
        showTableHoaDon(hoaDonRepository.getAllByStatus());
        System.out.println("list :"+(hoaDonRepository.getAllByStatus()));
    }//GEN-LAST:event_tb_SPMouseClicked

    private void buttonBadges6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges6ActionPerformed
        // TODO add your handling code here:
        HoaDonResponse1 hd = hoaDonRepository.getAllByStatus().get(indexHoaDonSelected);
       
        // Update vao CSDL 
        hoaDonRepository.updateThongTin(hd);
        // B2: Show lai table hoa don va xoa cac text o ben tay phai
        showTableHoaDon(hoaDonRepository.getAllByStatus()); // LOAD NHUNG HOA DON DANG TRANG THAI CHO THANH TOAN
        txt_ngayTT.setText("");
        txt_khachHang.setText("");
        txt_maHoaDon.setText("");
        txt_tongTien.setText("");
        txt_tongTien1.setText("");
        txt_maNhanVien.setText("");
    }//GEN-LAST:event_buttonBadges6ActionPerformed

    private void buttonBadges4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges4ActionPerformed
        // TODO add your handling code here:
        ThongTinKhachHangJFrame v = new ThongTinKhachHangJFrame();
        v.setVisible(true);
    }//GEN-LAST:event_buttonBadges4ActionPerformed

    private Double showTotalMoney(ArrayList<HoaDonChiTietReponse> lists) {
        double sum = 0;
        for (HoaDonChiTietReponse hdct : lists) {
            sum += hdct.getThanhTien();
        }
        return sum;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Product.swing.ButtonBadges buttonBadges1;
    private com.Product.swing.ButtonBadges buttonBadges2;
    private com.Product.swing.ButtonBadges buttonBadges3;
    private com.Product.swing.ButtonBadges buttonBadges4;
    private com.Product.swing.ButtonBadges buttonBadges5;
    private com.Product.swing.ButtonBadges buttonBadges6;
    private com.Product.GUI.Combobox combobox2;
    private com.Product.GUI.Combobox combobox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private com.Product.GUI.Table tb_SP;
    private com.Product.GUI.Table tb_hoaDon;
    private com.Product.GUI.Table tb_hoaDonChiTiet;
    private com.Product.GUI.textfield.TextField textField1;
    private com.Product.GUI.textfield.TextField textField10;
    private com.Product.GUI.textfield.TextField textField11;
    private com.Product.GUI.textfield.TextField textField12;
    private com.Product.GUI.textfield.TextField textField2;
    private com.Product.GUI.textfield.TextField textField3;
    private com.Product.GUI.textfield.TextField textField6;
    private com.Product.GUI.textfield.TextField textField8;
    private com.Product.GUI.textfield.TextField textField9;
    private com.Product.GUI.textfield.TextField txt_khachHang;
    private com.Product.GUI.textfield.TextField txt_maHoaDon;
    private com.Product.GUI.textfield.TextField txt_maNhanVien;
    private com.Product.GUI.textfield.TextField txt_ngayTT;
    private javax.swing.JTextField txt_tongTien;
    private javax.swing.JLabel txt_tongTien1;
    // End of variables declaration//GEN-END:variables
}
