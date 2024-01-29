package fileHandling.outputStream;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FOSDemo2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\fileout.txt");
            String str = "Welcome to Scientech Easy, Shivam complex, Dhanbad";
            byte b[] = str.getBytes();

            fos.write(b);
            fos.close();
            System.out.println("successfully written");
        }
        catch (FileNotFoundException fn){
            fn.printStackTrace();
        }
        catch (IOException io){
            io.printStackTrace();
        }
    }
}
