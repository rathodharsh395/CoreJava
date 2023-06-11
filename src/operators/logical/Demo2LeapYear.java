package operators.logical;
//leap year using && and || operator
import java.util.Scanner;
public class Demo2LeapYear {
    public static void main(String[] args) {
        Scanner hr= new Scanner(System.in);
        int year = hr.nextInt();
        System.out.println(
                (year%400==0)
                        ||
                        (year%100!=0 && year%4==0)?"leap Year":"not leap Year"
        );
        //prints true if leap year else false.
    }

}
