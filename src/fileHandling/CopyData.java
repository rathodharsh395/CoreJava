package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfile.txt");
            FileOutputStream fos = new FileOutputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\copyfile.txt");

            int value =0;
            while((value = fis.read()) != -1){
                fos.write(value);
            }
            fis.close();
            fos.close();
            System.out.println("Data copied successfully");
        }
        catch(FileNotFoundException fn){
            fn.printStackTrace();
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }
}
