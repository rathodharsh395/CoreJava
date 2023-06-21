package controlStatements.conditionalStatement;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("enter your marks :");
        Scanner hr = new Scanner(System.in);
        int marks =hr.nextInt();
        if(marks<25){
            System.out.println("Grade : F");
        } else if(marks>=25&marks<45){
            System.out.println("Grade : E");
        } else if (marks>=45&marks<50) {
            System.out.println("Grade : D");
        } else if (marks>=50&marks<60) {
            System.out.println("Grade : C");
        } else if (marks>=60&marks<80) {
            System.out.println("Grade : B");
        } else if (marks>80&marks<=100) {
            System.out.println("Grade : A");
        } else {
            System.out.println("incorrect input120");
        }
    }
}
