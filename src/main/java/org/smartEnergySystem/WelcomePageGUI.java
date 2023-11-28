package org.smartEnergySystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePageGUI extends JFrame {
    private final JTextField textField;

    public WelcomePageGUI(){
        super("Welcome. This is proprietary software for Smart Energy");

        textField = new JTextField(20);

        JButton createOrder = new JButton("Create order");
        JButton viewListOfActiveOrders = new JButton("List of active orders");
        JButton updateOrderInfo = new JButton("Update order information");

        createOrder.addActionListener(e -> {
            // Handle button click
            String inputText = textField.getText();
            JOptionPane.showMessageDialog(WelcomePageGUI.this, "You clicked the button!\nInput Text: " + inputText);
        });
            // Create a layout manager (in this case, a simple FlowLayout)
            setLayout(new java.awt.FlowLayout());

            // Add components to the frame
            add(createOrder);
            add(viewListOfActiveOrders);
            add(updateOrderInfo);

            // Set the default close operation
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Set the size of the window
            setSize(1920, 1080);

            // Center the window on the screen
            setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WelcomePageGUI().setVisible(true);
            }
        });
    }
}
