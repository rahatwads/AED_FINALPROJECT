/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import static java.awt.AWTEventMulticaster.add;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tanvikakde
 */
public class UserLoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserLoginJFrame
     */
    public UserLoginJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnULogin = new javax.swing.JButton();
        btnUBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblUUsername = new javax.swing.JLabel();
        lblUDob = new javax.swing.JLabel();
        txtUUsername = new javax.swing.JTextField();
        jUPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnULogin.setBackground(new java.awt.Color(255, 204, 204));
        btnULogin.setText("LOGIN");
        btnULogin.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnULogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnULogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 60, 30));

        btnUBack.setBackground(new java.awt.Color(255, 204, 204));
        btnUBack.setText("BACK");
        btnUBack.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnUBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnUBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 50, 30));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        lblTitle.setText("USER LOGIN");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        lblUUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUUsername.setText("USERNAME:");
        getContentPane().add(lblUUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        lblUDob.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUDob.setText("DOB:");
        getContentPane().add(lblUDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        txtUUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 119, -1));

        jUPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jUPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 119, -1));

        btnRegister.setBackground(new java.awt.Color(255, 204, 204));
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/car2.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUUsernameActionPerformed

    private void jUPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUPasswordActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        UserRegistrationJFrame ur = new UserRegistrationJFrame();
        this.hide();
        ur.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnULoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULoginActionPerformed
        // TODO add your handling code here:
        
//        String username = txtAUsername.getText();
//        String password = jPassword.getText();
//
//        if(username.equals("admin") && password.equals("admin123")){
//                    UserMainMenu umm = new UserMainMenu();
//                    this.hide();
//                    umm.setVisible(true);
//        }
//        else{
//            JOptionPane.showMessageDialog(this,"Incorrect Username/Password");
//        }
        String User_name = txtUUsername.getText();
        String Pass_word = String.valueOf(jUPassword.getPassword());
//        
       
//
        PreparedStatement pstmt = null;
        Connection c = null;

         try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");


                String query = "SELECT * FROM CUSTOMERS WHERE USER_NAME=? AND PASS_WORD=?";
                pstmt = c.prepareStatement(query);

                pstmt.setString(1, User_name);
                pstmt.setString(2, Pass_word);

                ResultSet rs = pstmt.executeQuery();

                //check if you have found a valid row
                if(rs.next()) {
                      
                    UserMainMenu umm = new UserMainMenu();
                    this.hide();
                    umm.setVisible(true);

                close();
                //tickets x= new tickets();
                //''x.setVisible(true);
                } else {
                            JOptionPane.showMessageDialog(this,"Username or Password is incorrect");
                        }
             } catch(ClassNotFoundException e) {

                            JOptionPane.showMessageDialog(this, e.getMessage());

                           } catch (SQLException ex) {
            Logger.getLogger(UserLoginJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                    if(pstmt != null)
                    pstmt.close();

                } catch (Exception ex) {
                  ex.printStackTrace();
            }

      try {

         if(c!= null)
            c.close();

      } catch (Exception ex) {
           ex.printStackTrace();
      }
}
        
    }//GEN-LAST:event_btnULoginActionPerformed

    private void btnUBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUBackActionPerformed
        // TODO add your handling code here:
        
        MainJFrame ur = new MainJFrame();
        this.hide();
        ur.setVisible(true);
    }//GEN-LAST:event_btnUBackActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUBack;
    private javax.swing.JButton btnULogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jUPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUDob;
    private javax.swing.JLabel lblUUsername;
    private javax.swing.JTextField txtUUsername;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
