package classComponents;
import java.util.Scanner;
// fibonacci series nth term using recursion
public class Method12B {
    public static void main(String[] args) {
        Scanner hr= new Scanner(System.in);
        System.out.println("enter n for nth term of fibonacci series");
        int N = hr.nextInt();
        Method12B fab= new Method12B();
        System.out.println(fab.getFab(N));
    }
     int getFab(int num){
        if(num==1){
            return 0;
        }
        else if(num==2){
            return 1;
        }
        else if(num==3){
            return 1;
        }
        return getFab(num-1)+getFab(num-2);
     }
}
