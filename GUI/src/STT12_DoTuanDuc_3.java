import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.io.*;
import java.util.InputMismatchException;

public class STT12_DoTuanDuc_3 {
    public static void main(String[] args) {
        // cau1();
        cau2();
    }

    static void cau1() {
        Circle c = new Circle((float) 25.5);
        Rectangle r = new Rectangle(5, 12);
        c.showInfo();
        r.showInfo();
    }

    static void cau2() {
        new Cau2();
    }
}

// Cau 1:
interface IShape {
    void showInfo();

    double getArea();

    double getPerimeter();

    final double PI = 3.1416;
}

class Circle implements IShape {
    private float radius;

    /**
     * Ham khoi tao khong tham so
     */
    Circle() {
    };

    /**
     * Constructor cua Circle
     * 
     * @param radius la ban kinh hinh tron
     */
    Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void showInfo() {
        System.out.println("Day la hinh tron co ban kinh la: " + this.radius);
        System.out.println("Dien tich la: " + this.getArea());
        System.out.println("Chu vi la: " + this.getPerimeter());
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return PI * 2 * radius;
    }
}

class Rectangle implements IShape {
    public double width;
    public double length;

    /**
     * Ham khoi tao khong tham so
     */
    Rectangle() {
    };

    /**
     * Ham tao co tham so cho hinh chu nhat
     * 
     * @param width  la chieu rong cua hinh nhat
     * @param length la chieu dai cua hinh chu nhat
     */
    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void showInfo() {
        System.out.println("Day la hinh chu nhat co chieu dai la " + this.length + "va chieu rong la " + this.width);
        System.out.println("Dien tich la: " + this.getArea());
        System.out.println("Chu vi la : " + this.getPerimeter());
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

}

// Cau 2:
class Cau2 extends JFrame {

    int area;

    Cau2() {
        JFrame frame = new JFrame();
        JLabel l1 = new JLabel();
        JTextField tf1 = new JTextField();
        JLabel l2 = new JLabel();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JButton button = new JButton();

        frame.setSize(500, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));
        frame.setTitle("Rectangle");

        l1.setText("Width: ");
        l1.setForeground(new ColorUIResource(0, 0, 0));

        l2.setText("Height: ");
        l2.setForeground(new ColorUIResource(0, 0, 0));

        tf1.setText("");
        tf1.setPreferredSize(new Dimension(100, 30));

        tf2.setText("");
        tf2.setPreferredSize(new Dimension(100, 30));

        button.setBounds(100, 100, 20, 20);
        button.setText("Calculate area");
        button.setFocusable(false);
        button.addActionListener(e -> {
            if (Integer.parseInt(tf1.getText()) < 0 || Integer.parseInt(tf1.getText()) < 0)
                System.out.println("Nhap khong thanh cong (do nhap so am)");
            else {
                try {
                    area = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
                } catch (InputMismatchException x) {
                    x.printStackTrace();
                }
            }
            tf1.setText("");
            tf2.setText("");
            tf3.setText(area + "");
        });
        try {
            File file = new File("outputRec.txt");
            OutputStream os = new FileOutputStream(file);
            BufferedOutputStream bo = new BufferedOutputStream(os);
            bo.write(("Width: " + tf1.getText()).getBytes());
            bo.write(("Heigth: " + tf2.getText()).getBytes());
            bo.flush();
            bo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(button);
        frame.add(tf3);
        frame.setVisible(true);
    }
}
