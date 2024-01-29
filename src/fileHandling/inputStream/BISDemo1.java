package fileHandling.inputStream;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BISDemo1{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfile.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i = 0;
            while((i=bis.read())!= -1){
                char ch = (char)i;
                System.out.print(ch);
            }
            bis.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}