package exceptionHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo29 {
    public static void method() throws FileNotFoundException {
//       FileReader file= new FileReader("C://User//Anurati//Desktop//abc.txt");
//       BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException("cannot find file");  // checked exception

//       throw new ArithmeticException();  Unchecked exception
    }
    public static void main(String[] args) {
        try{
            method();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("rest of code");

    }
}
