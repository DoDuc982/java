import javax.swing.JButton;
import java.awt.Color;

public class MyJButton{
    MyJButton(){
        JButton button = new JButton();
        button.setBounds(100, 100, 100, 20); 
        button.setText("Click this"); // Set text cho button
        button.setFocusable(false); // Loại bỏ viền xung quanh text sau khi click
        button.setBackground(Color.DARK_GRAY); // set background cho button 
        button.addActionListener(e -> System.out.println("poo")); // Thêm sự kiện khi click chuột
        // button.setEnabled(false); // set cho nút không bấm được
    }
}
