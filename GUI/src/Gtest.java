import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.io.*;

public class Gtest {
    public static void main(String[] args) {
        new App();

    }
}

class App extends JFrame {
    // Khai bao mang gom 10 ptu sinh vien
    Student[] list = new Student[10];
    int i = 0;

    App() {
        JFrame frame = new JFrame();
        JLabel l1 = new JLabel();
        JTextField tf1 = new JTextField();
        JLabel l2 = new JLabel();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JButton button = new JButton();

        frame.setSize(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        l1.setText("Tên: ");
        l1.setForeground(new ColorUIResource(0, 0, 0));

        l2.setText("Năm sinh: ");
        l2.setForeground(new ColorUIResource(0, 0, 0));

        tf1.setText("");
        tf1.setPreferredSize(new Dimension(100, 30));

        tf2.setText("");
        tf2.setPreferredSize(new Dimension(100, 30));

        button.setBounds(100, 100, 20, 20);
        button.setText("Click this");
        button.setFocusable(false);
        button.addActionListener(e -> {
            list[i] = new Student();
            tf3.setText(tf1.getText() + " " + tf2.getText());
            tf1.setText("");
            tf2.setText("");
            list[i].setName(tf1.getText());
            list[i].setBirthdate(tf2.getText());
            i++;
        });

        try {
            File file = new File("objectStudent.txt");
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            out.writeObject(list);
            out.close();
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

class Student implements Serializable {

    String name;
    String birthdate;

    Student() {
    }

    Student(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getName() {
        return name;
    }
}