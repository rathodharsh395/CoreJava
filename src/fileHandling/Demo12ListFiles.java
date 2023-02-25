package fileHandling;
import java.io.File;

public class Demo12ListFiles {
    public static void main(String[] args) {
        File folder = new File("src/finalKeyword");
        File[] files  = folder.listFiles();
        for(File file: files){
            System.out.println(file.getName()+"\t"+file.length());
        }
    }
}
