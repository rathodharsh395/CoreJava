package controlStatements.conditionalStatement;

import java.util.Scanner;

public class IfElseAssignment8_9 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.println("no: of classes held ");
        double classHeld =hr.nextDouble();
        System.out.println("no: of classes attended");
        double  attended = hr.nextDouble();
        char medical = 'N';
        double attendence = (attended/classHeld)*100;
        if(attendence>=75){
            System.out.println(attendence);
            System.out.println("Yes allowed");
        }
        else{
            System.out.println("Attendence is below 75%: Enter Y if medical cause");
            medical= hr.next().charAt(0);
            if(medical=='Y'){
                System.out.println("Yes allowed");
            }
            else {
                System.out.println("Not allowed");
            }
        }
    }
}
