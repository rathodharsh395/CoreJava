package fileHandling.inputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BISDemo3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfile.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.skip(5);
            System.out.println("Input stream after skipping first 5 bytes:");
            int value = 0;
            while((value = bis.read())!= -1){
                System.out.print((char)value);
            }
            bis.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
