/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import static java.awt.AWTEventMulticaster.add;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivanirahatwad
 */
public class SignUp_User extends javax.swing.JFrame {

    /**
     * Creates new form SignUp_User
     */
    public SignUp_User() {
        initComponents();
        autoID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomer_Id = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("USER REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 21, -1, -1));

        jLabel2.setText("Customer ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 79, -1, -1));

        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 135, -1, -1));

        jLabel4.setText("username");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 187, -1, -1));

        jLabel5.setText("DOB (Enter in DDMMYY Format)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 235, -1, -1));

        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 279, -1, -1));

        jLabel7.setText("Email Adress");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 332, -1, -1));

        txtCustomer_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomer_IdActionPerformed(evt);
            }
        });
        getContentPane().add(txtCustomer_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 76, 130, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 132, 130, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 184, 130, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 232, 130, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 276, 130, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 329, 130, -1));

        jButton1.setBackground(new java.awt.Color(51, 153, 0));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jButton1.setText("REGISTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 533, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/WhatsApp Image 2022-12-11 at 4.25.30 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void autoID() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");
            PreparedStatement pstmt = c.prepareStatement("SELECT MAX(customerID) FROM BookingCustomer");
            ResultSet rs = pstmt.executeQuery();
           
           
            rs.next();
            rs.getString("MAX(customerID)");

            if (rs.getString("MAX(customerID)") == null) {
                txtCustomer_Id.setText("C0001");
            } else {
                long id = Long.parseLong(rs.getString("MAX(customerID)").substring(2, rs.getString("MAX(customerID)").length()));
                id++;

                txtCustomer_Id.setText("C0" + String.format("%03d", id));

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtCustomer_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomer_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomer_IdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
           try{
        Cab_Booking.ConnectionClass c = new Cab_Booking.ConnectionClass();
        
                String customerid = txtCustomer_Id.getText();
                String name = jTextField2.getText();
		String username = jTextField3.getText();
		String dob = jTextField4.getText();
                String address = jTextField5.getText();
                String emailaddress = jTextField6.getText();
               
                if(customerid.length()==0 || name.length()==0 || username.length()==0 || dob.length()==0 || address.length()==0 ||
               emailaddress.length()==0 ){
            JOptionPane.showMessageDialog(this, "Enter All Required Fields");
            return;
                }
                    String emailR = "^(.+)@(.+)$";
        Pattern emailPattern = Pattern.compile(emailR);
        Matcher emailmatcher = emailPattern.matcher(emailaddress);
        if(emailmatcher.matches()==false){
            JOptionPane.showMessageDialog(this, "Enter Valid Email");
            return;
        }
        if(dob.length()!=6){
            JOptionPane.showMessageDialog(this, "invalid!, Enter DOB in DDMMYY Format");
            return;
        }
                
                String sql = "insert into BookingCustomer values('"+customerid+"', '"+name+"', '"+username+"', '"+dob+"' , '"+address+"' , '"+emailaddress+"')";
		c.s.executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "Account Created Successfully ");
                autoID();
                
                new Login_User().setVisible(true);
                setVisible(false);
         }catch(Exception e){
                System.out.println(e);
         }
        Login_User userlogin = new Login_User();
         userlogin.show();
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          CabBookMainJFrame CabBookMAinJFram = new CabBookMainJFrame();
       CabBookMAinJFram.show();
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtCustomer_Id;
    // End of variables declaration//GEN-END:variables
}