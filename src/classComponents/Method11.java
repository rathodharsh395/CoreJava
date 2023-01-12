package classComponents;
import java.util.Scanner;
public class Method11 {
    static void primeFactors(int number){

            for(int index=2;index<=number/2;index++){

                if(number%index==0 && isPrime(index)){
                    System.out.println(index);
                }
            }
    }
    static boolean isPrime(int index){
            boolean isPrime = true;
            for(int j=2;j<=index/2;j++){

                if(index%j==0){
                    return false;
                }
            }
            return isPrime;
    }
    public static void main(String [] args)
    {
            System.out.println("Enter NO to check prime factors:");
            Scanner hr= new Scanner(System.in);
            int number = hr.nextInt();
            primeFactors(number);
    }
}



