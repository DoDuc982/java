import java.io.*;


public class OReader {
    public static void main(String args[]) throws ClassNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream((new FileInputStream("nhap.txt")));
        Student[] a = (Student[]) in.readObject();
        System.out.println(a);
        in.close();
    }
}

class Student implements Serializable{
    
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
    public String toString() {
        return "name=" + name + ", " + "birthdate= " + birthdate + "]";
    }
}
