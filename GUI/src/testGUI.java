
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
public class testGUI {
    public static void main(String args[]){
        Student[] list = new Student[3];
        int i = 0;

        JFrame frame = new JFrame();
        JLabel l1 = new JLabel();
        JTextField tf1 = new JTextField();
        JLabel l2 = new JLabel();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();
        JButton button = new JButton();
        
        frame.setSize(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,2));

        l1.setText("Tên: ");
        l1.setForeground(new ColorUIResource(0, 0, 0));

        l2.setText("Năm sinh: ");
        l2.setForeground(new ColorUIResource(0, 0, 0));

        tf1.setText("");
        tf1.setPreferredSize(new Dimension(100,30));

        tf2.setText("");
        tf2.setPreferredSize(new Dimension(100,30));

        button.setBounds(100, 100, 20, 20);
        button.setText("Click this");
        button.setFocusable(false);
        button.addActionListener(e -> {
            tf3.setText(tf1.getText() + " " + tf2.getText());
            tf1.setText("");
            tf2.setText("");
            list[i].setName(tf1.getText());
            list[i].setBirthdate(Integer.parseInt(tf2.getText()));
        });
        
        frame.add(l1);
        frame.add(tf1);
        frame.add(l2);
        frame.add(tf2);
        frame.add(button);
        frame.add(tf3);
        frame.setVisible(true);
    }
}


class Student{
    
    String name;
    int birthdate;

    Student(){}
    Student(String name, int birthdate){
        this.name = name;
        this.birthdate = birthdate;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
    public int getBirthdate() {
        return birthdate;
    }
    public String getName() {
        return name;
    }
}