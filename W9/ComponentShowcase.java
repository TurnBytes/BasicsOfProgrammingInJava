import java.awt.*;
import java.awt.event.*;
public class ComponentShowcase extends Frame {
    ComponentShowcase() {
        setTitle("AWT Component Styles");
        setLayout(new FlowLayout());

        // 1. Buttons with different colors and sizes
        Button b1 = new Button("Small Red");
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        
        Button b2 = new Button("Big Blue");
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.YELLOW);
        b2.setFont(new Font("Serif", Font.BOLD, 24)); // Changing size via Font

        // 2. Text Input Fields
        TextField tf = new TextField("Type here...", 20);
        tf.setBackground(Color.LIGHT_GRAY);
        
        TextArea ta = new TextArea("Long multi-line text area", 5, 30);
        ta.setBackground(new Color(230, 255, 230)); // Soft Green

        // 3. Selection Components
        Checkbox cb1 = new Checkbox("Option A", true);
        Checkbox cb2 = new Checkbox("Option B");
        
        Choice dropdown = new Choice();
        dropdown.add("Java");
        dropdown.add("Python");
        dropdown.add("C++");

        

        Label multiSelectLabel = new Label("Multi-select options:");
        List multiSelectList = new List(4, true);
        multiSelectList.add("Option 1");
        multiSelectList.add("Option 2");
        multiSelectList.add("Option 3");
        multiSelectList.add("Option 4");
        multiSelectList.setMultipleMode(true);

        // 4. Labels and Scrollbars
        Label lbl = new Label("This is a styled Label");
        lbl.setFont(new Font("Monospaced", Font.ITALIC, 14));
        
        Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        sb.setPreferredSize(new Dimension(200, 20));

        // Adding everything
        add(lbl);
        add(b1); add(b2);
        add(tf); add(ta);
        add(cb1); add(cb2);
        add(dropdown);
        
        add(multiSelectList);
        add(sb);

        setSize(500, 600);
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

    public static void main(String[] args) {
        new ComponentShowcase();
    }
}