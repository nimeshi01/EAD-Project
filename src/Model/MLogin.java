/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Control.Clogin;
import View.VDashboard;
import View.VAppointment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author nimes
 */
public class MLogin {
    public String userid;
    public void Login(String username , String password)
    {
        ResultSet rst;
        ResultSet rst2;
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            Statement st2 = DBConnection.connectDB().createStatement();
            rst = st.executeQuery("select * from customer where email = '"+username+"' AND pass = '"+password+"';");
            rst2 = st2.executeQuery("select * from admin where email = '"+username+"' AND pass = '"+password+"';");
            if(rst.next())
            {
                userid = rst.getString("NIC");
                VAppointment v1 = new VAppointment();
                v1.setTitle("Make Appointment (" + userid + ")");
                v1.setVisible(true);
            }
            else if(rst2.next())
            {
                VDashboard a1 = new VDashboard();
                a1.setTitle("Admin Dashboard");
                a1.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Credentials", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }

    private static class Statement {

        public Statement() {
        }

        private Model.ResultSet executeQuery(String String) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
