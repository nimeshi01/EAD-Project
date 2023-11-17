/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.MAddRoom;
/**
 *
 * @author nimes
 */
public class CAddRoom {
    public void AddRoom(String roomname , Double price)
    {
        MAddRoom m1 = new MAddRoom();
        m1.AddRoom(roomname, price);
    }
}
