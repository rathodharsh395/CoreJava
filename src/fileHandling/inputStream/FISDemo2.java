package fileHandling.inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo2 {
    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("D:\\Harish\\Java World\\CoreJava P\\src\\temproryFiles\\myfile.txt");
            int size = fis.available();
            System.out.println("Total number of available bytes: "+size); // 25

            int n = size/10; // n = 2
            for(int i=0;i<n;i++){
                System.out.print((char)fis.read());
            }
            System.out.println("\nStill Available bytes: "+fis.available());

            byte byterarray[] = new byte[2];
            if(fis.read(byterarray) != n){
                System.out.println("Could not get "+n+" bytes");
            }
            String str = new String(byterarray,0,n);
            System.out.println(str);
            System.out.println("\nStill available bytes: "+fis.available());

            System.out.println("\nSkipping half of remaining bytes using skip() method");
            fis.skip(size/2);
            System.out.println("\nStill Available byte: "+fis.available());

            System.out.println("Reading "+n/2+" from the end of array");
            if(fis.read(byterarray,n/2,n/2)!= n/2){
                System.out.println("couldn't read "+n/2+" bytes.");
            }
            String str2 = new String(byterarray,0,byterarray.length);
            System.out.println(str2);
            System.out.println("\nStill Available byte: "+ fis.available());
            fis.close();

        }
        catch(FileNotFoundException e) {
            e.getMessage();
        }
        catch (IOException e) {
            e.getMessage();
        }


    }
}
