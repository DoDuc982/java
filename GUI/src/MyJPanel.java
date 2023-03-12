import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class MyJPanel {
    MyJPanel(){
        JLabel label = new JLabel();
        label.setText("Hello");
        label.setVerticalAlignment(JLabel.BOTTOM); // Set vị trí cho label trong panel theo chiều dọc
        // label.setHorizontalAlignment(JLabel.LEFT); // Set vị trí cho label trong panel theo chiều ngang
        // label.setBounds(100, 100, 100, 100); // set vị trí theo tọa độ cho label 
        // Panel giống với frame nhưng ở mức độ bên trong frame
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red); // Chọn màu cho panel
        redPanel.setBounds(0, 0, 200, 200); // Chọn kích thước panel 

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);  
        greenPanel.setBounds(200, 0, 200, 200);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(0, 200, 400, 200);

        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);
        j.setSize(800,800);
        j.setVisible(true);
        
        bluePanel.add(label);  // add label vào panel
        j.add(greenPanel); // add panel vào trong frame
        j.add(bluePanel);
        j.add(redPanel);
    }
}
