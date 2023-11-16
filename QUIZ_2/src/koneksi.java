/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Farra
 */
public class koneksi {
    private static java.sql.Connection Koneksi;
    
    public static java.sql.Connection getkoneksi(){
        if (Koneksi== null){
            try{
                String url = "jdbc:mysql://localhost:3306/login";
                String user = "root";
                String password ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Connection Successfully");
            }catch (Exception e){
                System.out.println("Error");
            }
        }
        return Koneksi;
    }
    
    public static void main(String args[]){
        getkoneksi();
    }
}
