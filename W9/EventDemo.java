import java.awt.*;
import java.awt.event.*;

public class EventDemo extends Frame implements ActionListener {
    TextField tf;
    Label lbl;
    
    EventDemo() {
        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 80, 30);

        lbl = new Label("");
        lbl.setBounds(50, 150, 220, 30);

        // Registering the listener
        b.addActionListener(this);

        add(b); 
        add(tf); 
        add(lbl);
        setSize(300, 300);
        setLayout(null);
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

    // Implementing the actionPerformed method
    public void actionPerformed(ActionEvent e) {
        //tf.setText("Hello World!");
        String value = tf.getText();
        if(value.isEmpty() || value.contains("5")){
            //System.out.println("Not Allowed! Either empty Or Invalid Input");
            //tf.setText("Hello World!");
            lbl.setText("Not Allowed! Either empty Or Invalid Input");
        }
        else{
        }
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}