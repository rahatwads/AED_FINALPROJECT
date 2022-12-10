/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author tanvikakde
 */
public class AdminLoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminLoginJFrame
     */
    public AdminLoginJFrame() {
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

        btnALogin = new javax.swing.JButton();
        btnABack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblAUsername = new javax.swing.JLabel();
        lblAPassword = new javax.swing.JLabel();
        txtAUsername = new javax.swing.JTextField();
        jAPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnALogin.setText("LOGIN");
        btnALogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALoginActionPerformed(evt);
            }
        });

        btnABack.setText("BACK");
        btnABack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnABackActionPerformed(evt);
            }
        });

        lblTitle.setText("ADMIN LOGIN");

        lblAUsername.setText("USERNAME:");

        lblAPassword.setText("PASSWORD:");

        txtAUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAUsername)
                            .addComponent(lblAPassword)
                            .addComponent(btnALogin))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnABack)
                            .addComponent(txtAUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jAPassword))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAUsername)
                    .addComponent(txtAUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAPassword)
                    .addComponent(jAPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnALogin)
                    .addComponent(btnABack))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnALoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALoginActionPerformed
        // TODO add your handling code here:

        String username = txtAUsername.getText();
        String password = jAPassword.getText();

        if(username.equals("admin") && password.equals("admin123")){
            AdminMainMenueJFrame c = new AdminMainMenueJFrame();
            this.hide();
            c.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this,"Incorrect Username/Password");
        }
    }//GEN-LAST:event_btnALoginActionPerformed

    private void txtAUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAUsernameActionPerformed

    private void btnABackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnABackActionPerformed
        // TODO add your handling code here:
        
        MainJFrame ur = new MainJFrame();
        this.hide();
        ur.setVisible(true);
    }//GEN-LAST:event_btnABackActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnABack;
    private javax.swing.JButton btnALogin;
    private javax.swing.JPasswordField jAPassword;
    private javax.swing.JLabel lblAPassword;
    private javax.swing.JLabel lblAUsername;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAUsername;
    // End of variables declaration//GEN-END:variables
}
