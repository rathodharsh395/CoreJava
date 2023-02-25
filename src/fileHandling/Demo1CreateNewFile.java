package fileHandling;
import java.io.File;
import java.io.IOException;
public class Demo1CreateNewFile {
    public static void main(String[] args) throws IOException
    {
        File file = new File("170223.txt");//cannot find symbol
        System.out.println(file.createNewFile());// returns boolean
        //unreported exception java.io.IOException; must be caught or declared to be thrown

    }
}
