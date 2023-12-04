package array;

import java.util.ArrayList;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int []a = {8,6,4,3,46,73,63,54,1};
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=0;i<a.length;i++)
            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }

        int sum1 =0;
        System.out.println("ever nos are:");
        for (int no:al1) {
            sum1 = sum1+no;
            System.out.print(no+" ");
            
        }
        System.out.println("\ntotal even nos are:"+al1.size()+"\nSum of all even no is:"+sum1);
        System.out.print("\n");
        System.out.println("odd nos are:");

        int sum2= 0;
        for (int no:al2) {
            sum2= sum2+no;
            System.out.print(no+" ");
        }
        System.out.println("\ntotal odd nos are:"+al2.size()+"\nSum of all odd nos is:"+sum2);
    }
}
