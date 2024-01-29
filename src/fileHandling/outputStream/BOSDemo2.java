package fileHandling.outputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BOSDemo2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos =new FileOutputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfileout.txt");
            BufferedOutputStream bos =new BufferedOutputStream(fos,1024);

            String data = "Hello Java";
            bos.write(data.getBytes());
            bos.flush(); // Flushing all data from internal buffer to destination file.
            bos.close();
            System.out.println("Successfully written");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
