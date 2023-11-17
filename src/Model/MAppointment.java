/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nimes
 */
public class MAppointment {

    public void Appointment(String customer , String roomname, String appoinmentdate, String bookstarttime, String bookendtime, String purpose, Double price , String bookstatus) {
             
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            int row_count = st.executeUpdate("INSERT INTO appointment ( room name, appoinmentdate , bookstarttime, bookendtime, purpose, price ) VALUES ('" + roomname + "','"+appoinmentdate+"','" + bookstarttime + "','" + bookendtime + "','" + purpose + "','" + price + "');");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null,"Appointment successfully Booked!");
            }
        }
        catch(SQLException e)
        {
             JOptionPane.showMessageDialog(null, ""+e+"");
        }      
    }

    public void AddAppointment(String appoinmentdate, String bookstatus, String roomname, String bookstarttime, String bookendtime, String purpose, Double price) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
    
