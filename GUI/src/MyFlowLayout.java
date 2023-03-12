import javax.swing.*;
import java.awt.*;
public class MyFlowLayout {
    MyFlowLayout(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // Điều chỉnh vị trí của các tp theo các hướng sẻ chảy từ đâu
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.setVisible(true);
    }
}
