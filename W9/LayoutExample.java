import java.awt.*;
import java.awt.event.*;


public class LayoutExample {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayout Demo");
        
        f.add(new Button("North"), BorderLayout.NORTH);
        f.add(new Button("South"), BorderLayout.SOUTH);
        f.add(new Button("East"), BorderLayout.EAST);
        f.add(new Button("West"), BorderLayout.WEST);
        f.add(new Button("Center"), BorderLayout.CENTER);

        f.setSize(400, 300);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Releases resources and closes the window
                f.dispose(); 
                // Optional: Terminates the entire program
                System.exit(0); 
            }
        });
    }
}