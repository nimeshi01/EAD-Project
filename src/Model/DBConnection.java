/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
/**
 *
 * @author nimes
 */
public class DBConnection {
    static Connection con;
    
    public static Connection connectDB()
    {
        try
        {
            String path = "jdbc:mysql://localhost/ead";
            //String path = "C:\\Users\\prade\\Downloads\\FinalCW\\CourseWork Nadith\\CourseWork\\src\\database";
            con = DriverManager.getConnection(path,"root","");
        }
        
        catch (SQLException e)
        {
            System.err.println("Exception "+e);
        }
        
        return con;
    }
}
