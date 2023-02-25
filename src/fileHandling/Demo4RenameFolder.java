package fileHandling;
import java.io.File;

public class Demo4RenameFolder {
    public static void main(String[] args) {
        File directory = new File("temporaryFiles");
        System.out.println(directory.renameTo(new File("tempFiles")));//returns boolean

    }
}
