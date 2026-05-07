import java.awt.*;
import java.awt.event.*;

public class FlowLayoutDemo extends Frame {
    FlowLayoutDemo() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20)); // Alignment, horizontal gap, vertical gap
        for (int i = 1; i <= 5; i++) {
            add(new Button("Button " + i));
        }
        //Button btn = new Button();
        //add(btn);
        setSize(300, 150);
        setVisible(true);


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
    public static void main(String[] args) { new FlowLayoutDemo(); }
}