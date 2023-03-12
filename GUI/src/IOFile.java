import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("write to a file.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
