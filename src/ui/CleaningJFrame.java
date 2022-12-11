/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import Cab_Booking.CarService;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author madhulikadekate
 */
public class CleaningJFrame extends javax.swing.JFrame {
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;

    /**
     * Creates new form CleaningJFrame
     */
    public CleaningJFrame() {
        initComponents();
        
        conn=CarService.connect();
      //  autoId();
        tablelord();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        printBtn = new javax.swing.JButton();
        vehLab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cleanTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        cleanTbl = new javax.swing.JTable();
        homeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        printBtn.setBackground(new java.awt.Color(255, 204, 204));
        printBtn.setText("Print");
        printBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        getContentPane().add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 395, 159, 32));

        vehLab.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        vehLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehLab.setText("Waiting List for Cleaning");
        getContentPane().add(vehLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 819, 37));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Vehicle Number :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 129, 107, -1));

        cleanTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cleanTxtKeyReleased(evt);
            }
        });
        getContentPane().add(cleanTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 126, 234, -1));

        cleanTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Service ID", "Vehicle Number", "Customer ID", "Vehicle Model", "Name", "Servicing Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cleanTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cleanTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(cleanTbl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 167, 800, 190));

        homeBtn.setBackground(new java.awt.Color(255, 204, 204));
        homeBtn.setText("Home");
        homeBtn.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(654, 55, 159, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/cc2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        int prcount=cleanTbl.getRowCount();
    if(prcount>0)
    {
       DefaultTableModel tableModel=(DefaultTableModel)cleanTbl.getModel();
      try {
//           
//             JasperPrint jasperPrint = null;
//             JasperCompileManager.compileReportToFile("C:\\Users\\ccs\\Documents\\NetBeansProjects\\ComputerService\\src\\report\\pendingList.jrxml");
//             jasperPrint = JasperFillManager.fillReport("C:\\Users\\ccs\\Documents\\NetBeansProjects\\ComputerService\\src\\report\\pendingList.jasper", null,
//             new JRTableModelDataSource(tableModel));
//             JasperViewer.viewReport(jasperPrint, false);
        cleanTbl.print();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane, "Not Details to print");
    }    
    }//GEN-LAST:event_printBtnActionPerformed

    private void cleanTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cleanTxtKeyReleased
        // TODO add your handling code here:
           try {

            String parseSql="SELECT `sid` as 'SID', `vnumber` as 'Vehicle Number', `model` as 'Model Number', `modelname` as 'Model', `nic` as 'Owner NIC', `oname` as 'Owner Name', `stype` as 'Service Type', `date` as 'Date' FROM `add_to_service` WHERE status ='1' AND stype='Cleanning' AND vnumber Like'%"+cleanTxt.getText()+"%'";
            pst=conn.prepareStatement(parseSql);
            rs=pst.executeQuery();
            cleanTbl.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            theader();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_cleanTxtKeyReleased

    private void cleanTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cleanTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cleanTblMouseClicked

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
         HomeJFrame Home = new HomeJFrame();
        this.hide();
        Home.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CleaningJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CleaningJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CleaningJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CleaningJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CleaningJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cleanTbl;
    private javax.swing.JTextField cleanTxt;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton printBtn;
    private javax.swing.JLabel vehLab;
    // End of variables declaration//GEN-END:variables

    private void tablelord() {
        try {
            String sql="SELECT `sid` as 'SID', `vnumber` as 'Vehicle Number', `model` as 'Model Number', `modelname` as 'Model', `nic` as 'Owner NIC', `oname` as 'Owner Name', `stype` as 'Service Type', `date` as 'Date' FROM `add_to_service` WHERE status ='1' AND stype='Cleanning'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
          cleanTbl.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            theader();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(rootPane, e);
        }
       theader();
    }

    private void theader() {
        JTableHeader thead = cleanTbl.getTableHeader();
       thead.setForeground(Color.BLACK);
    
       thead.setFont(new Font("Tahome", Font.BOLD, 12));
       
        TableColumn col1=cleanTbl.getColumnModel().getColumn(0);
        col1.setPreferredWidth(100);
        TableColumn col2=cleanTbl.getColumnModel().getColumn(1);
        col2.setPreferredWidth(100);
        TableColumn col3=cleanTbl.getColumnModel().getColumn(2);
        col3.setPreferredWidth(100);
        TableColumn col4=cleanTbl.getColumnModel().getColumn(3);
        col4.setPreferredWidth(100);
        TableColumn col5=cleanTbl.getColumnModel().getColumn(4);
        col5.setPreferredWidth(100);
        TableColumn col6=cleanTbl.getColumnModel().getColumn(5);
        col6.setPreferredWidth(100);
    }
}
