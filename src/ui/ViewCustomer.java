
package ui;

import Cab_Booking.ConnectionClass;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class ViewCustomer extends javax.swing.JFrame {

    JTable t1;
   String x[] = {"Customer_Id","First_Name","Last_Name","dob","Address","Email"};
   String y[][] = new String [20] [10];
    int i=0,j=0;
    public ViewCustomer() {
        initComponents();
    
    
    
      try{
            
            
        ConnectionClass con = new ConnectionClass();
        String q = "select * from Customer";
        ResultSet set = con.s.executeQuery(q);
        while (set.next()) 
        {
            y[i][j++] = set.getString("customerId");
            y[i][j++] = set.getString("firstname");
            y[i][j++] = set.getString("lastname");
            y[i][j++] = set.getString("dob");
            y[i][j++] = set.getString("address");
            y[i][j++] = set.getString("emailaddress");
            i++;
            j=0;
        }
        t1= new JTable(y,x);
     
                        
                        
                        
                  
        
        
}catch (Exception e2) {
                    e2.printStackTrace();
		}
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer_ID", "First_Name", "Last_Name", "dob", "Address", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
