package controlStatements.loops;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        System.out.println("enter no to print first n prime number");
        Scanner hr= new Scanner(System.in);
        int N = hr.nextInt();
        int count =0;
        for(int i=2;N!=count;i++){
            boolean isPrime = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime==true){
                System.out.println(i);
                count++;
            }
        }

    }
}
