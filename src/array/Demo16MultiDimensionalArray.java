package array;

import java.util.Scanner;

public class Demo16MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.println("enter the no. of rows and columns");
        int rows = hr.nextInt();
        int columns = hr.nextInt();

        int [][] matrix = new int[rows][columns];
        System.out.println("Enter the values for given matrix");

        for(int row=0;row< matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                matrix[row][column]=hr.nextInt();
            }
        }
        System.out.println("Printing the matrix");
        for(int row=0 ;row< matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
        StringBuffer as  = new StringBuffer();
    }
}
