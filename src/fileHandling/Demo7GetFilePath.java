package fileHandling;
import java.io.File;
public class Demo7GetFilePath {
    public static void main(String[] args) {
        File file = new File("/Harish/Java World/CoreJava P/src/fileHandling/Demo1CreateNewFile.java");
        System.out.println("File relative Path:"+file.getPath());
        System.out.println("File Absolute path:"+file.getAbsolutePath());
        System.out.println("File size "+file.length());
    }
}
