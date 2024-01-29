package exceptionHandling;
// Read and write class
import java.io.FileNotFoundException;

public class Demo28FileNotFoundException {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
        System.out.println("hellow");
        try {
            rw.saveFile();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }//java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
        System.out.println("Thank you");
    }
}
