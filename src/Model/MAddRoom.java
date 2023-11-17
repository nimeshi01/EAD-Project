/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;


/**
 *
 * @author nimes
 */
public class MAddRoom {
    public void AddRoom(String roomname , Double price)
    {
        try
        {
            Statement st = DBConnection.connectDB().createStatement();
            int row_count = st.executeUpdate("INSERT INTO std_room (roomname, roomPrice) VALUES ('"+roomname+"','"+price+"');");
            if(row_count > 0)
            {
                JOptionPane.showMessageDialog(null,"Room Successfully Added!!");
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
