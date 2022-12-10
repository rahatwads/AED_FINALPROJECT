/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cab_Booking;


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
 * @author madhulikadekate
 */
public class CarService {
    
    public static void main(String[] args) throws java.sql.SQLException {
        String user = "root";
        String password = "shivani3299";
        String url = "jdbc:mysql://localhost:3306/BONVOYAGE";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Connection c = DriverManager.getConnection(url, user, password);
        if (c != null) {
            System.out.print("SUCCESS");
        } else {
            System.out.print("FAILURE");
        }

    }

    public static Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    

