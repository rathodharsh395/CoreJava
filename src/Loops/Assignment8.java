package Loops;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.println("enter two numbers to find highest common factor");
        int first = hr.nextInt();
        int second = hr.nextInt();
        int factor=0;
        for(int i=first/2;i>=1;i--)
        {   if(first%i==0)
            {
                factor = i;
            }
            for(int j=second/2;j>=1;j--)
            {
                int sfacator = j;
                if(second%j==0 && factor==sfacator)
                {
                    first /= i;
                    second /= i;
                    System.out.println(i);
                    System.out.println(first+"/"+second);
                    return;
                }
            }

        }
    }
}

