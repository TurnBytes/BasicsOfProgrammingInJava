import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Frame {
    CardLayout card = new CardLayout();
    CardLayoutDemo() {
        setLayout(card);
        Button b1 = new Button("Card 1 - Click me");
        Button b2 = new Button("Card 2 - Click me");
        
        // Lambda for switching cards
        b1.addActionListener(e -> card.next(this));
        b2.addActionListener(e -> card.next(this));

        add(b1); add(b2);
        setSize(200, 200);
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
    public static void main(String[] args) { new CardLayoutDemo(); }
}