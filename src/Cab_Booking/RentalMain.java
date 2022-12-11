
package Cab_Booking;

import java.sql.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.DriverManager;


public class RentalMain {

    public static void main(String[] args) throws java.sql.SQLException {
        String user = "root";
        String password = "shivani3299";
        String url = "jdbc:mysql://localhost:3306/BONVOYAGE";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RentalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Connection c = DriverManager.getConnection(url, user, password);
        if (c != null) {
            System.out.print("SUCCESS");
        } else {
            System.out.print("FAILURE");
        }

    }

}