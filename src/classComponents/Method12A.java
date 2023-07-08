package classComponents;

import java.util.Scanner;
// without recursion printing whole series
public class Method12A {
    static int a=0,b=1,c;
    public static void main(String[] args) {

        System.out.println("enter n for nth term of fibonacci series");
        Scanner hr= new Scanner(System.in);
        int N = hr.nextInt();
        for(int i=1;i<=N;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
