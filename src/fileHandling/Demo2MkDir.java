package fileHandling;
import java.io.File;

public class Demo2MkDir {
    public static void main(String[] args) {
        File directory = new File("temporaryFiles");
        System.out.println(directory.mkdir());//returns boolean

    }
}
