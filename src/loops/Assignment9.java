package loops;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args){
        String choice = "";
        int sum = 0;
        int product = 1;
        int count = 0;
        Scanner hr= new Scanner(System.in);
        while (!(choice=="q"))
        {
            System.out.println("Enter a number or q to quit");
            choice = hr.next();

            if(!(choice=="q"))
            {
                int number = Integer.parseInt(choice);
                sum = sum+number;
                product= product*number;
                count++;

            }
        }
        System.out.println("Product is:"+product+"\nAverage is"+(sum/count));
    }
    }

