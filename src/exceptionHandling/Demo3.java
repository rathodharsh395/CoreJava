package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // how to handle exception  with the help of try-catch
        Scanner hr = new Scanner(System.in);
        System.out.println("Enter the numerator and denominator:");
        try {
            //exception prone code or problematic code
            int numerator = hr.nextInt();
            int denominator = hr.nextInt();
            System.out.println("division of two numbers is" + numerator / denominator);
        }
        //developer provided exception handler
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println(inputMismatchException);
        }


    }
}
