/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CarRentalUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author shivanirahatwad
 */
public class CustomerRegistration extends javax.swing.JFrame {

    /**
     * Creates new form CarRegistration
     */
    public CustomerRegistration() {
        initComponents();
        autoID();
    }
    
    
        public void autoID() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");
            Statement s = c.createStatement();

            ResultSet rs = s.executeQuery("SELECT MAX(CUSTOMER_ID) FROM CUSTOMERS");
            rs.next();
            rs.getString("MAX(CUSTOMER_ID)");

            if (rs.getString("MAX(CUSTOMER_ID)") == null) {
                txtCustomerId.setText("CU001");
            } else {
                long id = Long.parseLong(rs.getString("MAX(CUSTOMER_ID)").substring(2, rs.getString("MAX(CUSTOMER_ID)").length()));
                id++;

                txtCustomerId.setText("CU" + String.format("%03d", id));

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    
    
    
    private static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
        if (date!=null){
            java.sql.Date sqlDate = new java.sql.Date(date.getDate());
            return sqlDate;
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmailid = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnCreateAccount = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtCustomerId = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        lblCustomerId = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtEmailid = new javax.swing.JTextField();
        textAreaAddress = new java.awt.TextArea();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jPasswordField_Re = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmailid.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblEmailid.setText("EMAIL ID:");
        getContentPane().add(lblEmailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        lblTitle.setText("CUSTOMER REGISTRATION");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 338, -1));

        btnCreateAccount.setBackground(new java.awt.Color(153, 204, 255));
        btnCreateAccount.setText("CREATE ACCOUNT");
        btnCreateAccount.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 170, 30));

        btnBack.setBackground(new java.awt.Color(153, 204, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 140, 30));

        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 135, -1));

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 135, -1));

        lblCustomerId.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCustomerId.setText("CUSTOMER ID:");
        getContentPane().add(lblCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 135, -1));

        lblFirstName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblFirstName.setText("FIRST NAME:");
        getContentPane().add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        lblLastName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLastName.setText("LAST NAME:");
        getContentPane().add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        lblDob.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDob.setText("DOB:");
        getContentPane().add(lblDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        lblAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblAddress.setText("ADDRESS:");
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));
        getContentPane().add(txtEmailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 287, -1));
        getContentPane().add(textAreaAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 225, 46));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUsername.setText("USERNAME:");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 135, -1));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setText("PASSWORD:");
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        lblConfirmPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblConfirmPassword.setText("CONFIRM PASSWORD:");
        getContentPane().add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 136, -1));
        getContentPane().add(jPasswordField_Re, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 136, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 136, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CarRentalUI/T2.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, -10, 1480, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:

        try {

            //              String DOB = new SimpleDateFormat("yyyy-MM-dd").format(new Date(request.getParameter("date")));

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");

            String Customer_Id = txtCustomerId.getText();
            String First_Name = txtFirstName.getText();
            String Last_Name = txtLastName.getText();
            String Username = txtUsername.getText();
            String Pass_word = String.valueOf(jPassword.getPassword());
            String Confirm_Password = String.valueOf(jPasswordField_Re.getPassword());
            java.util.Date DOB = jDateChooser1.getDate();
            String Address = textAreaAddress.getText();
            String Email_Id = txtEmailid.getText();

            Statement stm = c.createStatement();
            //String sql = "Insert into cars values(?,?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement("INSERT INTO CUSTOMERS(CUSTOMER_ID, FIRST_NAME, LAST_NAME, USER_NAME, PASS_WORD, DOB, ADDRESS, EMAIL_ID) VALUES(?,?,?,?,?,?,?,?)");
            pstmt.setString (1,Customer_Id);
            pstmt.setString(2, First_Name);
            pstmt.setString(3, Last_Name);
            pstmt.setString(4, Username);
            pstmt.setString(5, Pass_word);
            pstmt.setDate(6, convertUtilDateToSqlDate(DOB));
            pstmt.setString(7, Address);
            pstmt.setString(8, Email_Id);

            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Your Account Has Been Created, Kindly Login To Continue.");

            txtCustomerId.setText("");
            txtFirstName.setText("");
            txtLastName.setText("");
            txtUsername.setText("");
            jPassword.setText("");
            jPasswordField_Re.setText("");
            textAreaAddress.setText("");
            textAreaAddress.setText("");
            txtCustomerId.requestFocus();
            autoID();

            c.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        CabUserLogin al = new  CabUserLogin();
        this.hide();
        al.setVisible(true);
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CabUserLogin ul = new CabUserLogin();
        this.hide();
        ul.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateAccount;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordField_Re;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmailid;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private java.awt.TextArea textAreaAddress;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtEmailid;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}