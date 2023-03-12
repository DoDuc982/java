import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class MyJLabel {
    MyJLabel(){
        JLabel label = new JLabel();
        label.setText("Have you text"); // Hiển thị text
        label.setForeground(new Color(0xFFFFFF)); // set màu chữ
        label.setFont(new Font("Tahoma",Font.PLAIN,20)); // set font chữ 
    } 
}
