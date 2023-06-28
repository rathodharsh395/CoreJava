package controlStatements.conditionalStatement;
import java.util.Scanner;
public class IfElseAssignment13 {
    public static void main(String[] args) {
        System.out.println("enter number to reverse:");
        Scanner hr= new Scanner(System.in);
        int num = hr.nextInt();
        int reverse=0;
        while (num>0){
            int lastDigit = num%10;
            reverse = reverse*10 + lastDigit;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
