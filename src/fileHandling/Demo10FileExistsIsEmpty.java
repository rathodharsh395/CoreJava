package fileHandling;
import java.io.File;

public class Demo10FileExistsIsEmpty {
    public static void main(String[] args) {
        File f = new File("170223.txt");
        if(f.exists()){
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Writable: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("Fie Size: "+ f.length());
//            System.out.println("File Removed: "+ f.delete());
        }
        else {
            System.out.println("File doesn't Exists");
        }

    }
}
