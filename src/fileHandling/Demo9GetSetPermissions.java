package fileHandling;
import java.io.File;

public class Demo9GetSetPermissions {
    public static void main(String[] args) {
     File file = new File("170223.txt");
        System.out.println("Read permission "+file.canRead());
        System.out.println("Write permission "+file.canWrite());
        System.out.println("Execute permission "+file.canExecute());

        //change the permission
        System.out.println(file.setWritable(true));
        System.out.println("Last modified time "+ file.lastModified());

    }//1677074608909 : it changes only if we  modify content of file not permission
}
