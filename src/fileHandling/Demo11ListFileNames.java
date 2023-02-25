package fileHandling;
import java.io.File;

public class Demo11ListFileNames {
    public static void main(String[] args) {
        File fil = new File("src/array");
        String[] fileNames = fil.list();
        for(String fileName:fileNames){
            System.out.println(fileName);
        }
    }
}
