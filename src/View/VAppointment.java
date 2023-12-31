/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.CAddRoom;
import Control.CAppointment;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author nimes
 */

public class VAppointment extends javax.swing.JFrame {

    /**
     * Creates new form VAppointment
     */
    public VAppointment() {
        initComponents();
        populateStudentNames();
    }
String customer;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        timePicker1 = new com.raven.swing.TimePicker();
        timePicker2 = new com.raven.swing.TimePicker();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        purbox = new javax.swing.JTextField();
        pricebtn = new javax.swing.JTextField();
        cmb_room = new javax.swing.JComboBox<>();
        endbox = new javax.swing.JTextField();
        startbox = new javax.swing.JTextField();
        datebox = new javax.swing.JTextField();
        savebtn = new java.awt.Button();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        timePicker1.setDisplayText(startbox);

        timePicker2.setDisplayText(endbox);

        dateChooser1.setTextRefernce(datebox);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        getContentPane().setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Room Name :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(141, 147, 88, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Appoinment Date:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(141, 187, 112, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Book Start Time:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(141, 231, 98, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Book End Time:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(141, 271, 98, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Purpose:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(141, 311, 72, 16);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Price:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(141, 351, 72, 16);
        getContentPane().add(purbox);
        purbox.setBounds(280, 308, 167, 22);
        getContentPane().add(pricebtn);
        pricebtn.setBounds(280, 348, 167, 22);

        cmb_room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bridal Photo Shoot", "Clothing Photo Shoot", "Professional Photo Shoot", "NIC Photo" }));
        cmb_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_roomActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_room);
        cmb_room.setBounds(280, 144, 167, 22);

        endbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endboxMouseClicked(evt);
            }
        });
        endbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endboxActionPerformed(evt);
            }
        });
        getContentPane().add(endbox);
        endbox.setBounds(280, 268, 167, 22);

        startbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startboxMouseClicked(evt);
            }
        });
        startbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startboxActionPerformed(evt);
            }
        });
        startbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                startboxKeyTyped(evt);
            }
        });
        getContentPane().add(startbox);
        startbox.setBounds(280, 228, 167, 22);

        datebox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateboxMouseClicked(evt);
            }
        });
        datebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateboxActionPerformed(evt);
            }
        });
        datebox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateboxKeyTyped(evt);
            }
        });
        getContentPane().add(datebox);
        datebox.setBounds(280, 184, 167, 22);

        savebtn.setActionCommand("SAVE");
        savebtn.setBackground(new java.awt.Color(153, 153, 153));
        savebtn.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        savebtn.setLabel("Save");
        savebtn.setName("savebtn"); // NOI18N
        savebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtnMouseClicked(evt);
            }
        });
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        getContentPane().add(savebtn);
        savebtn.setBounds(297, 408, 99, 39);
        savebtn.getAccessibleContext().setAccessibleName("SAVE");

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(null);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(30, 40, 620, 420);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Make an Appoinment");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(230, 10, 227, 25);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 680, 480);

        setSize(new java.awt.Dimension(693, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startboxActionPerformed
        // TODO add your handling code here:
        timePicker1.showPopup(this, (getWidth() - timePicker1.getPreferredSize().width) / 2, (getHeight() - timePicker1.getPreferredSize().height) / 2);
    }//GEN-LAST:event_startboxActionPerformed

    private void endboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endboxActionPerformed
        // TODO add your handling code here:
       timePicker2.showPopup(this, (getWidth() - timePicker2.getPreferredSize().width) / 2, (getHeight() - timePicker2.getPreferredSize().height) / 2);
    }//GEN-LAST:event_endboxActionPerformed

    private void startboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startboxKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
                if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                    evt.consume(); 
                }
    }//GEN-LAST:event_startboxKeyTyped

    private void dateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_dateboxActionPerformed

    private void dateboxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateboxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dateboxKeyTyped

    private void dateboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateboxMouseClicked
        // TODO add your handling code here:
        dateChooser1.showPopup();
        
    }//GEN-LAST:event_dateboxMouseClicked

    private void startboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startboxMouseClicked
        // TODO add your handling code here:
        timePicker1.showPopup(this, (getWidth() - timePicker1.getPreferredSize().width) / 2, (getHeight() - timePicker1.getPreferredSize().height) / 2);
    }//GEN-LAST:event_startboxMouseClicked

    private void endboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endboxMouseClicked
        // TODO add your handling code here:
        timePicker2.showPopup(this, (getWidth() - timePicker2.getPreferredSize().width) / 2, (getHeight() - timePicker2.getPreferredSize().height) / 2);
    }//GEN-LAST:event_endboxMouseClicked

    private String extractUserIDFromTitle(String title) {
    int startIndex = title.indexOf("(");
    int endIndex = title.indexOf(")");
    
    if (startIndex != -1 && endIndex != -1 && startIndex < endIndex) {
        return title.substring(startIndex + 1, endIndex);
    } else {
        return null;
    }
}
    
    private void populateStudentNames() {
        // Establish a database connection
        ResultSet rt = null;
        try
        {
            Statement st = Model.DBConnection.connectDB().createStatement();
            rt =  st.executeQuery("SELECT roomname FROM rooms;");
            
            ArrayList<String> studentNames = new ArrayList<>();
            while (rt.next()) {
                studentNames.add(rt.getString("roomname"));
            }
            
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(studentNames.toArray(new String[0]));
            cmb_room.setModel(model);
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    LocalDate datep = null;
    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        customer = getTitle();
    String appoinmentdate = datebox.getText();
    String cus = extractUserIDFromTitle(customer);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate datep = LocalDate.parse(appoinmentdate, formatter);
    LocalDate currentDate = LocalDate.now();
    
    if (datep.isBefore(currentDate)) {
        JOptionPane.showMessageDialog(null, "Error: Appointment date must be after today");
    } else {
        String bookstatus = "Pending";
        String roomname = (String) cmb_room.getSelectedItem();
        String bookstarttime = startbox.getText();
        String bookendtime = endbox.getText();
        String purpose = purbox.getText();
        Double price = Double.parseDouble(pricebtn.getText());

        CAppointment C1 = new CAppointment();
        C1.AddAppointment(cus, roomname, appoinmentdate, bookstarttime, bookendtime, purpose, price, bookstatus);
    }
        
        
    }//GEN-LAST:event_savebtnActionPerformed

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_savebtnMouseClicked

    private void cmb_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_roomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_roomActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VAppointment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_room;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JTextField datebox;
    private javax.swing.JTextField endbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pricebtn;
    private javax.swing.JTextField purbox;
    private java.awt.Button savebtn;
    private javax.swing.JTextField startbox;
    private com.raven.swing.TimePicker timePicker1;
    private com.raven.swing.TimePicker timePicker2;
    // End of variables declaration//GEN-END:variables
}
