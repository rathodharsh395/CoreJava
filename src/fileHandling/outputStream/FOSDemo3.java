package fileHandling.outputStream;

import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FOSDemo3 {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfileout.txt");
            DataInputStream dis = new DataInputStream(System.in);
            int value =0;
            System.out.println("Start writing and press enter button to end writing");
            while ( (value = dis.read()) != '\n'){
                char ch = (char) value;
                fos.write(ch);
            }
            fos.close();
            dis.close();
            System.out.println("Successfully written");
        }catch (FileNotFoundException fn){
            fn.printStackTrace();
        }
        catch (IOException io){
            io.printStackTrace();
        }
    }
}
