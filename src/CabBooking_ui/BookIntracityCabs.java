package CabBooking_ui;

import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.JTextField;
import Cab_Booking.ConnectionClass;
import java.util.Random;

public class BookIntracityCabs extends javax.swing.JFrame  {
 
    

    BookIntracityCabs() {
        initComponents();
jTextField1.setEditable(false);
jTextField5.setEditable(false);
jTextField6.setEditable(false);
jTextField7.setEditable(false);
jTextField8.setEditable(false);
jTextField9.setEditable(false);
jTextField10.setEditable(false);
        try {
            ConnectionClass con = new ConnectionClass();
            String q = "select source from DriverIntracity";
            ResultSet set = con.s.executeQuery(q);
            while (set.next()) {

                choice1.add(set.getString("source"));

            }
//            set.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            ConnectionClass con = new ConnectionClass();
            String q = "select username from BookingCustomer";
            ResultSet set = con.s.executeQuery(q);
            while (set.next()) {

                choice3.add(set.getString("username"));

            }
//            set.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
//         try {
//            ConnectionClass con = new ConnectionClass();
//            String q = "select destination from DriverIntracity";
//            ResultSet set = con.s.executeQuery(q);
//            while (set.next()) {
//
//                choice3.add(set.getString("destination"));
//
//            }
////            set.close();
//        } catch (Exception e2) {
//            e2.printStackTrace();
//        }
Random rm = new Random();
jTextField1.setText(""+Math.abs(rm.nextInt() % 100000));
jTextField1.setForeground(Color.red);
  
 
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        btnBook = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        choice1 = new java.awt.Choice();
        choice2 = new java.awt.Choice();
        choice3 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 54, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Source");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Destination");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setText("Driver Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setText("Car");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setText("Destination From");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("Destination to");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setText("Price");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 51, 107, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 107, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 107, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 105, -1));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 105, -1));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 105, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 107, -1));

        btnBook.setBackground(new java.awt.Color(255, 255, 0));
        btnBook.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnBook.setText("BOOK");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        btnCancel.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice1MouseClicked(evt);
            }
        });
        getContentPane().add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 107, -1));

        choice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice2MouseClicked(evt);
            }
        });
        getContentPane().add(choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 107, -1));

        choice3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice3MouseClicked(evt);
            }
        });
        getContentPane().add(choice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 122, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("BOOK INTERCITY CAB");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabBooking_ui/WhatsApp Image 2022-12-11 at 4.25.30 PM.jpeg"))); // NOI18N
        jLabel12.setToolTipText("");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
     String bid = jTextField1.getText();
     String username = choice3.getSelectedItem();
     String dname = jTextField6.getText();
     String car = jTextField10.getText();
     String source = jTextField9.getText();
     String destination = jTextField8.getText();
     String price = jTextField7.getText();
     try{
         ConnectionClass c = new ConnectionClass();
         String ql = "insert into intracitycabbook values('"+bid+"','"+username+"','"+dname+"','"+car+"','"+source+"','"+destination+"','"+price+"')";
         int aa = c.s.executeUpdate(ql);
         if(aa == 1){
             JOptionPane.showMessageDialog(null,"Cab Booked successfully");
             ConfirmationEmail confemail = new ConfirmationEmail();
            confemail.show();
            dispose();
                        
          
         } else {
             JOptionPane.showMessageDialog(null,"Please fill all the details");
         
         }
     } catch (Exception e2) {
            e2.printStackTrace();
        }
     
     
     
     
     
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        CabBookHomePage userhome = new CabBookHomePage();
         userhome.show();
         dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void choice3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice3MouseClicked
       try{
       
       ConnectionClass con = new ConnectionClass();
       String username = choice3.getSelectedItem();
       String ql = "select name from BookingCustomer where username = '"+username+"'";
       ResultSet set = con.s.executeQuery(ql);
       while(set.next())
       {
           jTextField5.setText(set.getString("name"));
       }set.close();
       }
       
       catch (Exception e2) {
                    e2.printStackTrace();
		}    
       
       
       
       
       
    }//GEN-LAST:event_choice3MouseClicked

    private void choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseClicked
       
        choice2.removeAll();
        try{
            ConnectionClass con = new ConnectionClass();
            String source = choice1.getSelectedItem();
            String q1 = "select destination from DriverIntracity where source='"+source+"'";
            ResultSet set = con.s.executeQuery(q1);
            while(set.next())
            {
                choice2.add(set.getString("destination"));
            }
        } catch(Exception exx)
        {
        exx.printStackTrace();
        }
    
        
    }//GEN-LAST:event_choice1MouseClicked

    private void choice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice2MouseClicked
       try{
            ConnectionClass con = new ConnectionClass();
            String source = choice1.getSelectedItem();
            String destination = choice2.getSelectedItem();
            String q1 = "select *  from DriverIntracity where source= '"+source+"' and destination='"+destination+"'";
            ResultSet set = con.s.executeQuery(q1);
            while(set.next())
            {
              jTextField6.setText(set.getString("driver"));
               jTextField10.setText(set.getString("car"));
               jTextField9.setText(set.getString("source"));
          jTextField8.setText(set.getString("destination"));
           jTextField7.setText(set.getString("price"));
              
            }
        } catch(Exception exx)
        {
        exx.printStackTrace();
        }
    
    }//GEN-LAST:event_choice2MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

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
            java.util.logging.Logger.getLogger(BookIntracityCabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookIntracityCabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookIntracityCabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookIntracityCabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookIntracityCabs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCancel;
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private java.awt.Choice choice3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
