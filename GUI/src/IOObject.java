import java.io.*;

public class IOObject {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file = new File("objectO.txt");
        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        Student[] list = new Student[3];
        list[0] =  new Student(1, "Peter");
        list[1] =  new Student(2, "David");
        list[2] =  new Student(3, "Tommy");
        out.writeObject(list);
        out.close();
    }
}

class Student implements Serializable{
    private int studentID;
    private String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
