package exceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
// used in class Demo28FileNotFoundClass
public class ReadAndWrite {
    void readFile()throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("d:abc.txt");
    }//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
    void saveFile()throws FileNotFoundException{
        FileOutputStream fos = new FileOutputStream("f:harish.txt");
//      FileOutputStream fos = new FileOutputStream("d:harish.txt");
    }//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown

    public static void main(String[] args) {

    }
    /* FileInputStream class throws "FileNotFoundException" which is compile
     time exception or checked exception so we have to handle the exception
     for this purpose we have to use either try-catch or throws keyword.
     */
}
