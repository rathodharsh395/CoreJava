package fileHandling;
import java.io.File;

public class Demo6DeleteFolder {
    public static void main(String[] args) {
        File directory = new File("tempFiles");
        System.out.println(directory.delete());//returns boolean
    }
}
