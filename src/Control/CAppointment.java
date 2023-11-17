/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MAppointment;
import View.ResultSet;
import java.util.Date;

/**
 *
 * @author nimes
 */
public class CAppointment {
   public void AddAppointment(String customer, String appoinment, String bookstatus, String roomname, String appoinmentdate, String bookstarttime, String bookendtime, String purpose, Double price)
    {
        MAppointment a1 = new MAppointment();
        a1.Appointment(customer , roomname,appoinmentdate,  bookstarttime, bookendtime, purpose, price , bookstatus);
    } 

    public void AddAppointment(String cus, String roomname, String appoinmentdate, String bookstarttime, String bookendtime, String purpose, Double price, String bookstatus) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet getAppoinmentInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 
    
