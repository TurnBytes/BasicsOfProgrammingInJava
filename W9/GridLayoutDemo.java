import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends Frame {
    GridLayoutDemo() {
        setLayout(new GridLayout(3, 2, 5, 5)); // 3 rows, 2 columns, gaps
        for (int i = 1; i <= 6; i++) {
            add(new Button("Cell " + i));
        }
        setSize(300, 300);
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
    public static void main(String[] args) { new GridLayoutDemo(); }
}