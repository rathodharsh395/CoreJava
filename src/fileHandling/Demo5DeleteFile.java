package fileHandling;
import java.io.File;

public class Demo5DeleteFile {
    public static void main(String[] args) {
        File file = new File("180223.txt");
        System.out.println(file.delete());//returns boolean
    }
}
