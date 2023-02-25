package exceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readFile()throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d:abc/txt");
    }//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
    void saveFile()throws FileNotFoundException{
        String text = "this is demo";
        FileOutputStream fos = new FileOutputStream("d:khetawat.txt");
    }//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

    public static void main(String[] args) {

    }
}
