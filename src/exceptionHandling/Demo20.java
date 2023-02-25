package exceptionHandling;
import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args)throws InvalidAgeException{

      Scanner hr = new Scanner(System.in);
      System.out.println("Enter the age");
      int age= hr.nextInt();
      if (age < 18) {
              throw new InvalidAgeException("Invalid age");
      } else {
              System.out.println("You are eligible for voting ");
      }
      System.out.println("Thank You");
    }
    //throw keyword is mostly use to throw user defined exception
    // ie . InvalidAgeException
}
// After writing throws at main method even if you handle exception using try catch
// the control will be passed to default exception handler .