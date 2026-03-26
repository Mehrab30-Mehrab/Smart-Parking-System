/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart.parking.system;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author User
 */
public final class ParkingGui {
    
     private final ParkingManager manager;

    public ParkingGui(ParkingManager manager) {
        this.manager = manager;
        createUI();
    }

    public void createUI() {

        JFrame frame = new JFrame("Smart Parking System");

        JButton parkCarBtn = new JButton("Park Car");
        parkCarBtn.setBounds(50, 50, 120, 30);

        parkCarBtn.addActionListener((ActionEvent e) -> {
            String num = JOptionPane.showInputDialog("Enter Car Number");
            
            Vehicle car = new Car(num);
            ParkingTicket t = manager.parkVehicle(car);
            
            if (t != null)
                JOptionPane.showMessageDialog(frame, "Ticket: " + t.getTicketId());
        });

        frame.add(parkCarBtn);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    
}
