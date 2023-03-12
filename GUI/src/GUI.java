import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;

public class GUI {
    public static void main(String args[]){
        
        JFrame frame = new JFrame();
        JButton button = new JButton("Submit");
        JTextField textField = new JTextField();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10, 10)); // Set layout theo ma trận
        frame.getContentPane().setBackground(new ColorUIResource(20, 30, 50)); // Cài đặt background cho app
        
        button.setPreferredSize(new Dimension(100,30));
        button.setFocusable(false);
        button.addActionListener(e ->{
            System.out.println("Hello " + textField.getText());    
        });

        textField.setPreferredSize(new Dimension(200,30));
        
        frame.add(button);
        frame.add(textField);

        frame.setVisible(true);

    }
}
