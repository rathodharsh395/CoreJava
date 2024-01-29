package fileHandling.outputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BOSDemo1{
    public static void main(String[] args){
        try{
            FileOutputStream fos= new FileOutputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfileout.txt");
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            String s="Welcome to Scientech Easy";
            byte b[]= s.getBytes();
            bos.write(b);
            bos.close();
            System.out.println("Successfully written..");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
