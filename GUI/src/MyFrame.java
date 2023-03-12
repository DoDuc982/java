import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;


public class MyFrame extends JFrame{
    MyFrame(){
        this.setVisible(true); // Cài đặt để xuất hiện 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cài đặt để thoát khi bấm x ở góc màn hình
        //this.setResizable(false); // Cài đặt để không phóng to thu nhỏ được
        this.setSize(500,500); // Cài đặt kích thước 1 frame
        this.setTitle("GUI"); // Cài đặt tên của chương trình

        ImageIcon img = new ImageIcon("Logo.jpg"); // Khai báo icon
        this.setIconImage(img.getImage()); // Cài đặt icon cho app
        this.getContentPane().setBackground(new ColorUIResource(20, 30, 50)); // Cài đặt background cho app
    }
}
