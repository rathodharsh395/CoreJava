package classComponents;
import java.util.Scanner;
public class Method1
{
    public static void main(String [] args){
        Scanner hr = new Scanner(System.in);
        System.out.println("Enter the Three numbers:");
        int number1 = hr.nextInt();
        int number2 = hr.nextInt();
        int number3 = hr.nextInt();
        Method1 re= new Method1();

        System.out.println("Max:" + re.maxNum(number1, number2, number3));
        System.out.println("Min:" + re.minNum(number1, number2, number3));
    }
        int  maxNum(int number1,int number2, int number3)
        {
            if (number1 > number2 && number1 > number3) {
                return number1;
            }
            else {
                 if (number2 > number1 && number2 > number3) {
                    return number2;
                 } else {
                    return number3;
                }
             }
        }

        int  minNum(int number1,int number2, int number3){
                if(number1 < number2 && number1 < number3)
                { return number1 ;
                }
                else{
                    if(number2 < number1 && number2 < number3)
                    { return number2;
                    }
                    else{
                        return number3;
                    }
                }
       }
}
