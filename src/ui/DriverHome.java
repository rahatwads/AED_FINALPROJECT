/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author shivanirahatwad
 */
public class DriverHome extends javax.swing.JFrame {

    /**
     * Creates new form DriverHome
     */
    public DriverHome() {
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

        btnIntercity = new javax.swing.JButton();
        btnIntracity = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIntercity.setText("INTERCITY REGISTRATION");
        btnIntercity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntercityActionPerformed(evt);
            }
        });

        btnIntracity.setText("INTRACITY REGISTRATION");
        btnIntracity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntracityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btnIntercity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btnIntracity)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIntercity)
                    .addComponent(btnIntracity))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntercityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntercityActionPerformed
                DriverIntercityRegistration DInterR = new DriverIntercityRegistration();
        DInterR .show();
        dispose();
    }//GEN-LAST:event_btnIntercityActionPerformed

    private void btnIntracityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntracityActionPerformed
           DriverIntracityRegistration DIntraR = new DriverIntracityRegistration();
        DIntraR .show();
        dispose();
    }//GEN-LAST:event_btnIntracityActionPerformed

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
            java.util.logging.Logger.getLogger(DriverHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIntercity;
    private javax.swing.JButton btnIntracity;
    // End of variables declaration//GEN-END:variables
}
