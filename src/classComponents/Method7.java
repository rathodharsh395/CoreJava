package classComponents;
import java.util.Scanner;
public class Method7{
    boolean isPrime;
    void getPrime(int number){
            for(int i = 2; i <= number/2; i++){
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
        }
        public static void main(String []args)
        {
            Method7 re = new Method7();
            System.out.println("Enter number to check prime:");
            Scanner hr = new Scanner(System.in);
            int number = hr.nextInt();
            re.getPrime(number);
            boolean isPrime = re.isPrime;
            System.out.println("Number is Prime:"+isPrime);
        }
}

