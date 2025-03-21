import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        
        JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 95, 30); 
        
        frame.add(button);
        frame.setSize(300, 300); 
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
       
        button.addActionListener(e -> System.out.println("Button clicked!"));
    }
}
