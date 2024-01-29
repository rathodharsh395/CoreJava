package fileHandling.inputStream;

import java.io.File;
import java.io.FileInputStream;
public class FISDemo1{
    public static void main(String[] args){
        try{
            File f = new File("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfile.txt");
            f.createNewFile();

            FileInputStream fis = new FileInputStream(f);
            int value = 0;
            while((value = fis.read())!= -1){
                System.out.print((char)value);
            }
            fis.close();
//          fis.available();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
