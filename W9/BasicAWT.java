import java.awt.*;
import java.awt.event.*;

public class BasicAWT extends Frame {
    BasicAWT() {
        // Creating components
        Button btn = new Button("Click Me");
        Label lbl = new Label("Welcome to AWT");

        // Setting positions manually (Null Layout)
        lbl.setBounds(50, 50, 150, 30);
        btn.setBounds(50, 100, 80, 30);

        // Adding components to the frame
        add(lbl);
        add(btn);

        // Frame settings
        setSize(300, 200);
        setLayout(null); // No layout manager
        setVisible(true);
        
        // Add window listener
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Releases resources and closes the window
                dispose(); 
                // Optional: Terminates the entire program
                System.exit(0); 
            }
        });
    }
    public static void main(String[] args) {
        new BasicAWT();
    }
}