package classComponents;
import java.util.Scanner;
// using concept of recursion to find factorial
public class Method9 {
    int fact=1;
    public static void main(String[] args){
        System.out.println("enter number for which you want factorial:");
        Scanner hr=new Scanner(System.in);
        Method9 recusion= new Method9();
        System.out.println(recusion.getFact(hr.nextInt()));
    }
    int getFact(int num){
        if(num>=1){
            fact=fact*num;
            getFact(num-1);
        }
        return fact;
    }
}
