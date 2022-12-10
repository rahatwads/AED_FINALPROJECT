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
public class CarRegistrationJFrame extends javax.swing.JFrame {

    /**
     * Creates new form CarRegistrationJFrame
     */
    public CarRegistrationJFrame() {
        initComponents();
        //autoID();
        Update_Table();
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
        jPanel1 = new javax.swing.JPanel();
        lblCarId = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblMake = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblFeePerDay = new javax.swing.JLabel();
        txtCarId = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtMake = new javax.swing.JTextField();
        CBStatus = new javax.swing.JComboBox<>();
        txtFeePerDay = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Car Registration");

        lblCarId.setText("Car Id:");

        lblModel.setText("Model:");

        lblMake.setText("Make:");

        lblStatus.setText("Status:");

        lblFeePerDay.setText("Fee Per Day:");

        txtCarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarIdActionPerformed(evt);
            }
        });

        CBStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Available", "Booked" }));
        CBStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBStatusActionPerformed(evt);
            }
        });

        txtFeePerDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFeePerDayActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCarId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCarId, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblModel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMake)
                        .addGap(18, 18, 18)
                        .addComponent(txtMake))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFeePerDay)
                        .addGap(18, 18, 18)
                        .addComponent(txtFeePerDay)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarId)
                    .addComponent(txtCarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMake)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(CBStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFeePerDay)
                    .addComponent(txtFeePerDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnBack))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car ID", "Model", "Make", "Status", "Fee Per Day"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    public void autoID() {
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");
//            Statement s = c.createStatement();
//
//            ResultSet rs = s.executeQuery("SELECT MAX(CAR_ID) FROM CARS");
//            rs.next();
//            rs.getString("MAX(CAR_ID)");
//
//            if (rs.getString("MAX(CAR_ID)") == null) {
//                txtCarId.setText("C0001");
//            } else {
//                long id = Long.parseLong(rs.getString("MAX(CAR_ID)").substring(2, rs.getString("MAX(CAR_ID)").length()));
//                id++;
//
//                txtCarId.setText("C0" + String.format("%03d", id));
//
//            }
//
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//
//    }

    public void Update_Table() {

        int r;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");
            PreparedStatement pstmt = c.prepareStatement("SELECT * FROM CARS");
            ResultSet rs = pstmt.executeQuery();

            ResultSetMetaData rd = rs.getMetaData();
            r = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) tblDisplay.getModel();
            df.setRowCount(0);

            while (rs.next()) {

                Vector v2 = new Vector();

                for (int i = 1; i <= r; i++) {
                    v2.add(rs.getString("CAR_ID"));
                    v2.add(rs.getString("MODEL"));
                    v2.add(rs.getString("MAKE"));
                    v2.add(rs.getString("STATUS"));
                    v2.add(rs.getString("FEE_PER_DAY"));

                }
                df.addRow(v2);

            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private void txtCarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarIdActionPerformed

    private void CBStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBStatusActionPerformed

    private void txtFeePerDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFeePerDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFeePerDayActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");

            int Car_Id = Integer.parseInt(txtCarId.getText());
            String Model = txtModel.getText();
            String Make = txtMake.getText();
            String Status = (String) CBStatus.getSelectedItem();
            int Fee_Per_Day = Integer.parseInt(txtFeePerDay.getText());

            Statement stm = c.createStatement();
            //String sql = "Insert into cars values(?,?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement("INSERT INTO CARS(CAR_ID, MODEL, MAKE, STATUS, FEE_PER_DAY) VALUES(?,?,?,?,?)");
            pstmt.setInt (1,Car_Id);
            pstmt.setString(2, Model);
            pstmt.setString(3, Make);
            pstmt.setString(4, Status);
            pstmt.setInt(5, Fee_Per_Day);
     
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Car Has Been Added!");
           // populateCARS();
            txtCarId.setText("");
            txtModel.setText("");
            txtMake.setText("");
            CBStatus.setSelectedIndex(-1);
            txtFeePerDay.setText("");
            txtModel.requestFocus();
            //autoID();
            Update_Table();

            c.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BONVOYAGE", "root", "shivani3299");

            int Car_Id = Integer.parseInt(txtCarId.getText());
            String Model = txtModel.getText();
            String Make = txtMake.getText();
            String Status = (String) CBStatus.getSelectedItem();
            int Fee_Per_Day = Integer.parseInt(txtFeePerDay.getText());

            Statement stm = c.createStatement();
            String sql = "Insert into cars values(?,?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(sql);
            pstmt.setInt(1, Car_Id);
            pstmt.setString(2, Model);
            pstmt.setString(3, Make);
            pstmt.setString(4, Status);
            pstmt.setInt(5, Fee_Per_Day);

            pstmt.execute();

            c.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        AdminMainMenueJFrame amm = new AdminMainMenueJFrame();
        this.hide();
        amm.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(CarRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarRegistrationJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarRegistrationJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBStatus;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCarId;
    private javax.swing.JLabel lblFeePerDay;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtCarId;
    private javax.swing.JTextField txtFeePerDay;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    // End of variables declaration//GEN-END:variables
}
