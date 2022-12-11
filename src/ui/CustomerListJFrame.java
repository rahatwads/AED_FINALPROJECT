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
public class CustomerListJFrame extends javax.swing.JFrame {
  Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    
    /**
     * Creates new form CustomerListJFrame
     */
    public CustomerListJFrame() {
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

        jLabel2 = new javax.swing.JLabel();
        VnumTxt = new javax.swing.JTextField();
        CidTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vehLab = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTbl = new javax.swing.JTable();
        homeBtn = new javax.swing.JButton();
        prtBtn = new javax.swing.JButton();
        clrBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Vehicle Number :");

        VnumTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                VnumTxtKeyReleased(evt);
            }
        });

        CidTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CidTxtKeyReleased(evt);
            }
        });

        jLabel3.setText("Customer ID :");

        vehLab.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        vehLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vehLab.setText("Customer List");

        listTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Name", "Address", "Phone Number", "Email ID", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listTbl);

        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        prtBtn.setText("Print");
        prtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prtBtnActionPerformed(evt);
            }
        });

        clrBtn.setText("Clear");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(vehLab, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(VnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(641, 641, 641)
                                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(prtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehLab, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VnumTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VnumTxtKeyReleased
        // TODO add your handling code here:
        try {

            String parseSql="SELECT `cid` as 'Customer Id', `c_name` as 'Customer Name', `c_adress` as 'Customer Address', `c_ho_num` as 'TP Land', `c_mo_num` as 'TP Mobile', `c_email` as 'Email', `c_date` as 'R Date' FROM `customer` where c_name Like'%"+VnumTxt.getText()+"%'";
            pst=conn.prepareStatement(parseSql);
            rs=pst.executeQuery();
            listTbl.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            theader();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_VnumTxtKeyReleased

    private void CidTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CidTxtKeyReleased
        // TODO add your handling code here:
        try {

            String parseSql="SELECT `cid` as 'Customer Id', `c_name` as 'Customer Name', `c_adress` as 'Customer Address', `c_ho_num` as 'TP Land', `c_mo_num` as 'TP Mobile', `c_email` as 'Email', `c_date` as 'R Date' FROM `customer` where cid Like'%"+CidTxt.getText()+"%'";
            pst=conn.prepareStatement(parseSql);
            rs=pst.executeQuery();
            listTbl.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            theader();
        } catch (Exception e) {
            
        }
    }//GEN-LAST:event_CidTxtKeyReleased

    private void listTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTblMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_listTblMouseClicked

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        // TODO add your handling code here:
        HomeJFrame Home = new HomeJFrame();
        this.hide();
        Home.setVisible(true);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void prtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prtBtnActionPerformed
        // TODO add your handling code here:
        int prcount=listTbl.getRowCount();
    if(prcount>0)
    {
        DefaultTableModel tableModel=(DefaultTableModel)listTbl.getModel();
        try {
//            // HashMap<String, Object> para=new HashMap<>();
//            // para.put("tittle","Sale Report");
//            // TableModelData();
//             JasperPrint jasperPrint = null;
//             JasperCompileManager.compileReportToFile("C:\\Users\\ccs\\Documents\\NetBeansProjects\\ComputerService\\src\\report\\customer.jrxml");
//             jasperPrint = JasperFillManager.fillReport("C:\\Users\\ccs\\Documents\\NetBeansProjects\\ComputerService\\src\\report\\customer.jasper", null,
//             new JRTableModelDataSource(tableModel));
//             JasperViewer.viewReport(jasperPrint, false);
            
           listTbl.print();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    else
    {
        JOptionPane.showMessageDialog(rootPane, "Not Details to print");
    }    

    }//GEN-LAST:event_prtBtnActionPerformed

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnActionPerformed
        // TODO add your handling code here:
        CidTxt.setText("");
     
     tablelord();

    }//GEN-LAST:event_clrBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerListJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerListJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CidTxt;
    private javax.swing.JTextField VnumTxt;
    private javax.swing.JButton clrBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listTbl;
    private javax.swing.JButton prtBtn;
    private javax.swing.JLabel vehLab;
    // End of variables declaration//GEN-END:variables

    private void tablelord() {
        try {
            String sql="SELECT `cid` as 'Customer Id', `c_name` as 'Customer Name', `c_adress` as 'Customer Address', `c_ho_num` as 'TP Land', `c_mo_num` as 'TP Mobile', `c_email` as 'Email', `c_date` as 'R Date' FROM `customer`";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            listTbl.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
       theader();
    }

    private void theader() {
        JTableHeader thead = listTbl.getTableHeader();
       thead.setForeground(Color.BLUE);
    
       thead.setFont(new Font("Tahome", Font.BOLD, 14));
       
        TableColumn col1=listTbl.getColumnModel().getColumn(0);
        col1.setPreferredWidth(100);
        TableColumn col2=listTbl.getColumnModel().getColumn(1);
        col2.setPreferredWidth(130);
        TableColumn col3=listTbl.getColumnModel().getColumn(2);
        col3.setPreferredWidth(150);
        TableColumn col4=listTbl.getColumnModel().getColumn(3);
        col4.setPreferredWidth(100);
        TableColumn col5=listTbl.getColumnModel().getColumn(4);
        col5.setPreferredWidth(105);
        TableColumn col6=listTbl.getColumnModel().getColumn(5);
        col6.setPreferredWidth(150);
    }
}
