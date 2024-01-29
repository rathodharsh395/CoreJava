package fileHandling.inputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BISDemo2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfile.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            System.out.println("Available bytes at the beginning: "+bis.available());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println((char)bis.read());
            System.out.println("Available bytes at the end: "+bis.available());
            bis.close();
        }
        catch (FileNotFoundException fn){
            fn.printStackTrace();
        }
        catch (IOException fn){
            fn.printStackTrace();
        }
    }
}
