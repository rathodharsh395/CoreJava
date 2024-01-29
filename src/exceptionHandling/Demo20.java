package exceptionHandling;
import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args){

      Scanner hr = new Scanner(System.in);
      System.out.println("Enter the age");
      int age= hr.nextInt();
      if (age < 18) {
              try {
                  throw new InvalidAgeException("Invalid age");
              }
              catch (InvalidAgeException e){
                  e.printStackTrace();
              }
      } else {
              System.out.println("You are eligible for voting ");
      }
      System.out.println("Thank You");
    }
    //throw keyword is mostly use to throw user defined exception
    // ie . InvalidAgeException
}