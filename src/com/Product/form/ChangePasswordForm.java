/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Product.form;


import com.Product.main.Login;
import main.util.Session;
import javax.swing.JOptionPane;
import main.dao.NhanVienDao;
import main.entity.NhanVienConnect;

/**
 *
 * @author tungt
 */
public class ChangePasswordForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangePasswordForm
     */
    private Session ss = Session.getInstance();
    private NhanVienDao dao = new NhanVienDao();

    public ChangePasswordForm() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Đổi Mật Khẩu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPasswordNew = new com.Product.GUI.textfield.PasswordField();
        txtConfirmPasswordNew = new com.Product.GUI.textfield.PasswordField();
        btnChangePassword = new com.Product.swing.ButtonBadges();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Quên Mật Khẩu");

        txtPasswordNew.setLabelText("Nhập mật khẩu mới");

        txtConfirmPasswordNew.setLabelText("Xác nhận mật khẩu mới");

        btnChangePassword.setBackground(new java.awt.Color(255, 153, 153));
        btnChangePassword.setText("Đổi Mật Khẩu");
        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPasswordNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtConfirmPasswordNew, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtConfirmPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
          String PassNew = txtPasswordNew.getText();
        String ConfirmPassNew = txtConfirmPasswordNew.getText();
        String email = (String) ss.get("email");

        if (!PassNew.equals(ConfirmPassNew)) {
            // Mật khẩu mới và xác nhận mật khẩu không khớp
            JOptionPane.showMessageDialog(this, "Mật khẩu xác nhận không khớp. Vui lòng thử lại.");
            return;
        }

        // Lấy thông tin nhân viên từ cơ sở dữ liệu
        NhanVienConnect nv = dao.select_byEmail(email);

        if (nv == null) {
            // Không tìm thấy nhân viên với email này
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên với email này.");
            return;
        }

        // Kiểm tra mật khẩu mới không trùng với mật khẩu cũ
        if (nv.getMatKhau().equals(PassNew)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới không được trùng với mật khẩu cũ.");
            return;
        }

        // Cập nhật mật khẩu mới
        nv.setMatKhau(PassNew);
        dao.update(nv);

        // Kiểm tra xem mật khẩu đã được cập nhật hay chưa
        NhanVienConnect updatedNv = dao.select_byEmail(email);

        if (updatedNv != null && updatedNv.getMatKhau().equals(PassNew)) {
            // Đổi mật khẩu thành công
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công");
            Login v = new Login();
            this.dispose();
            v.setVisible(true);
        } else {
            // Đổi mật khẩu thất bại
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại. Vui lòng thử lại.");
        }
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.Product.swing.ButtonBadges btnChangePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.Product.GUI.textfield.PasswordField txtConfirmPasswordNew;
    private com.Product.GUI.textfield.PasswordField txtPasswordNew;
    // End of variables declaration//GEN-END:variables
}
