import javax.swing.*;
import java.awt.*;

public class MyBorderLayout {
    // BorderLayout là layout dùng để phân chia thành 5 vùng South, East, West, North, Center tương ứng với 5 panel tự động
    MyBorderLayout(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(5,5)); // Điều chỉnh độ rộng giữa các panel

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.YELLOW);

        panel2.setPreferredSize(new Dimension(100, 100)); // Điều chỉnh chiều rộng, chiều cao cho panel
        panel3.setPreferredSize(new Dimension(100, 100)); // Điều chỉnh chiều rộng, chiều cao cho panel
        panel4.setPreferredSize(new Dimension(100, 100)); // Điều chỉnh chiều rộng, chiều cao cho panel
        panel5.setPreferredSize(new Dimension(100, 100)); // Điều chỉnh chiều rộng, chiều cao cho panel
        panel1.setPreferredSize(new Dimension(100, 100)); // Điều chỉnh chiều rộng, chiều cao cho panel

        frame.add(panel1, BorderLayout.NORTH);  // add vào frame theo borderLayout
        frame.add(panel2, BorderLayout.SOUTH);  // add vào frame theo borderLayout
        frame.add(panel3, BorderLayout.EAST);   // add vào frame theo borderLayout
        frame.add(panel4, BorderLayout.WEST);   // add vào frame theo borderLayout
        frame.add(panel5, BorderLayout.CENTER); // add vào frame theo borderLayout
        // Ngoài ra có thể thêm vào layout này vào trong panel
    }
}
