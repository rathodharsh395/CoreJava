package classComponents;
import java.util.Scanner;
public class Method4 {
        Scanner hr = new Scanner(System.in);
        int number1 = hr.nextInt();
        int number2 = hr.nextInt();
        int getSum(int num1,int num2){
            return num1+num2;
        }
        public static void main(String [] args)
        {   System.out.println("Enter two number ");
            Method4 re = new Method4();
            System.out.println("Enter two number to sum");
            int num1 =re.number1;
            int num2 =re.number2;
            System.out.println("Sum:"+re.getSum(num1,num2));
        }
}
