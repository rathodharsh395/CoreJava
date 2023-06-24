package controlStatements.conditionalStatement;

import java.util.Scanner;

public class IfElseAssignment11 {
    public static void main(String[] args) {
        System.out.println("enter year:");
        Scanner hr= new Scanner(System.in);
        int year = hr.nextInt();
        if((year%400==0)||(year%4==0&&year%100!=0)){
            System.out.println(year+": is Leap");
        }
        else {
            System.out.println(year+": in normal");
        }
    }
}
