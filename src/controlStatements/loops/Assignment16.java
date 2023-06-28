package controlStatements.loops;
import java.util.Scanner;
public class Assignment16 {
    public static void main(String[] args) {
        Scanner hr=new Scanner(System.in);
        System.out.println("enter number:");
        int num = hr.nextInt();
    //  this.everOdd(num); CTE: "this cannot be referenced from a static context"
        Assignment16 as = new Assignment16();
        as.everOdd(num);
    }
    void everOdd(int num){
        int even =0, odd =0;
        while (num>0){
            int last = num% 10;
            if(last %2==0){
                even += last;
            }else {
                odd+= last;
            }
            num = num/10;
        }
        System.out.println("Sum of Even: "+ even+"\n"+ "Sum of Odd: "+odd);

    }
}
