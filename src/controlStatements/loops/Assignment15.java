package controlStatements.loops;
import java.util.Scanner;

public class Assignment15 {
    public static void main(String[] args) {
        Scanner hr= new Scanner(System.in);
        System.out.println("enter number for prime factor:");
        int num = hr.nextInt();
        for(int i=2;i<=num/2;i++ ){
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++){   // 2,3 are always true because they never checked if condition
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(num%i==0 && isPrime== true){
                System.out.println(i);
            }

        }
    }
}
