package CabBooking_ui;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author shivanirahatwad
 */
public class CabBookHomePage extends javax.swing.JFrame {

   
    public CabBookHomePage() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem9 = new javax.swing.JMenuItem();
        btnInter = new javax.swing.JButton();
        btnIntra = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cab Booking Home Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInter.setBackground(new java.awt.Color(255, 255, 51));
        btnInter.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnInter.setText("BOOK INTERCITY CAB");
        btnInter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterActionPerformed(evt);
            }
        });
        getContentPane().add(btnInter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 240, -1));

        btnIntra.setBackground(new java.awt.Color(255, 255, 51));
        btnIntra.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnIntra.setText("BOOK INTRACITY CAB");
        btnIntra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnIntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntraActionPerformed(evt);
            }
        });
        getContentPane().add(btnIntra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 240, -1));

        btnLogout.setBackground(new java.awt.Color(204, 204, 204));
        btnLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 16, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabBooking_ui/WhatsApp Image 2022-12-11 at 4.25.30 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-620, -220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterActionPerformed
        BookIntercityCab bookinter = new BookIntercityCab();
       bookinter.show();
       dispose();
    }//GEN-LAST:event_btnInterActionPerformed

    private void btnIntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntraActionPerformed
        BookIntracityCabs bookintra = new BookIntracityCabs();
       bookintra.show();
       dispose();
    }//GEN-LAST:event_btnIntraActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        CabBookMainJFrame CabBookMAinJFram = new CabBookMainJFrame();
       CabBookMAinJFram.show();
       dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(CabBookHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CabBookHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CabBookHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CabBookHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CabBookHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInter;
    private javax.swing.JButton btnIntra;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
