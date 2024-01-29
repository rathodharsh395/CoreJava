package fileHandling.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo1{
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\fileout.txt",true);
            fos.write(87);
            fos.close();
            System.out.println("Successfully written");
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
