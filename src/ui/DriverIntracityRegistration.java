
package ui;

import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;
import Cab_Booking.ConnectionClass;
import javax.swing.table.DefaultTableModel;


public class DriverIntracityRegistration extends javax.swing.JFrame {

    public DriverIntracityRegistration() {
        initComponents();
//        Update_Table();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdrivername = new javax.swing.JTextField();
        txtdriversource = new javax.swing.JTextField();
        txtdest = new javax.swing.JTextField();
        txtcar = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("INTRACITY DRIVER REGISTRATION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jLabel2.setText("Driver Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 74, -1, -1));

        jLabel3.setText("Source");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 112, 72, -1));

        jLabel4.setText("Destination");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 156, 72, -1));

        jLabel5.setText("Car");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 193, 72, -1));

        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 236, 72, -1));
        getContentPane().add(txtdrivername, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 71, 93, -1));

        txtdriversource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdriversourceActionPerformed(evt);
            }
        });
        getContentPane().add(txtdriversource, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 112, 93, -1));

        txtdest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestActionPerformed(evt);
            }
        });
        getContentPane().add(txtdest, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 153, 93, -1));

        txtcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcarActionPerformed(evt);
            }
        });
        getContentPane().add(txtcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 190, 93, -1));

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 233, 93, -1));

        btnAdd.setBackground(new java.awt.Color(255, 255, 0));
        btnAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAdd.setText("Add ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 286, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 51, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 286, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/drew-beamer-kUHfMW8awpE-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    
    private void txtdriversourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdriversourceActionPerformed
        
    }//GEN-LAST:event_txtdriversourceActionPerformed

    private void txtdestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestActionPerformed
      
    }//GEN-LAST:event_txtdestActionPerformed

    private void txtcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcarActionPerformed
       
    }//GEN-LAST:event_txtcarActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        
    }//GEN-LAST:event_txtpriceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DriverHome DriverH = new DriverHome();
        DriverH .show();
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        {                                          
         try{
       ConnectionClass c = new ConnectionClass();
        
                String driver = txtdrivername.getText();
                String source = txtdriversource.getText();
		String destination = txtdest.getText();
		String car = txtcar.getText();
                String price = txtprice.getText();
                
                String sql = "insert into DriverIntracity(driver,source,destination,car,price) values('"+driver+"', '"+source+"', '"+destination+"', '"+car+"', '"+price+"')";
		c.s.executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "Account Created Successfully ");
                
                new DriverHome().setVisible(true);
                setVisible(false);
               
               
         }catch(Exception e){
                System.out.println(e);
         }
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(DriverIntracityRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverIntracityRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverIntracityRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverIntracityRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverIntracityRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtcar;
    private javax.swing.JTextField txtdest;
    private javax.swing.JTextField txtdrivername;
    private javax.swing.JTextField txtdriversource;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
