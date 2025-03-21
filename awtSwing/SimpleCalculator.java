import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        
        JTextField display = new JTextField();
        display.setBounds(50, 40, 300, 50);
        display.setEditable(false); 
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        frame.add(display);

        
        String[] buttons = {
            "7", "8", "9", "/", 
            "4", "5", "6", "*", 
            "1", "2", "3", "-", 
            "C", "0", "=", "+"
        };

        
        int x = 50, y = 120;

       
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setBounds(x, y, 60, 40);
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            frame.add(button);

            
            x += 70;
            if (x > 300) {
                x = 50;
                y += 50;
            }

            
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String currentText = display.getText();
                    String buttonText = button.getText();

                    if (buttonText.equals("=")) {
                        try {
                            display.setText(eval(currentText)); 
                        } catch (Exception ex) {
                            display.setText("Error");
                        }
                    } else if (buttonText.equals("C")) {
                        display.setText(""); 
                    } else {
                        display.setText(currentText + buttonText); 
                    }
                }
            });
        }

       
        frame.setVisible(true);
    }

    
    private static String eval(String expression) {
        try {
            return String.valueOf((int) new javax.script.ScriptEngineManager()
                .getEngineByName("JavaScript")
                .eval(expression));
        } catch (Exception e) {
            return "Error";
        }
    }
}
