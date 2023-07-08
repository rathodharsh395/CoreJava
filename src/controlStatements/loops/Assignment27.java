package controlStatements.loops;

import java.util.Scanner;

public class Assignment27 {
    public static void main(String[] args) {
        System.out.println("enter no to check palindrome:");
        Scanner hr= new Scanner(System.in);
        int num = hr.nextInt();
        int Quotient = num;
        int reverse = 0;
        while (0<Quotient){
            int lastDigit = num%10;
            reverse = (reverse*10)+lastDigit;
            Quotient =num/10;
        }
        if(reverse==num){
            System.out.println(num+"is palindrome");
        }
        else {
            System.out.println(num+"is not palindrome");
        }
    }
}
