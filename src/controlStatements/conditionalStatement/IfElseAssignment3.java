package controlStatements.conditionalStatement;

import java.util.Scanner;

public class IfElseAssignment3 {
    public static void main(String[] args) {
        System.out.println("Enter quantity of product");
        Scanner hr = new Scanner(System.in);
        int quantity= hr.nextInt();
        int unitCost = 100;
        int totalCost = unitCost*quantity;
        if(totalCost>1000){
            System.out.println("Total:"+ totalCost);
            int discount = (10*totalCost)/100;
            System.out.println("discount:"+ discount);
            int payableAmount = totalCost - discount;
            System.out.println("payabale amount:"+payableAmount);
        }
        else {
            System.out.println("Total:"+totalCost);
        }

    }
}
