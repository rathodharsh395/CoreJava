package array;

import java.util.Scanner;

public class Demo17MultiDimensionalArray {
    public static void main(String[]args){
        int [][]matrix = Demo17MultiDimensionalArray.acceptMatrix();
        printMatrix(matrix);

    }
    private static int[][] acceptMatrix(){
        Scanner hr= new Scanner(System.in);
        System.out.println("enter no. of rows and columns");
        int rows = hr.nextInt();
        int columns= hr.nextInt();
        int[][] matrix = new int[rows][columns];

        System.out.println("enter values for given matrix");
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                 matrix[row][column] = hr.nextInt();
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matx){
        System.out.println("Printing the matrix");
        for(int row=0;row<matx.length;row++){
            for(int column=0;column<matx[row].length;column++){
                System.out.print(matx[row][column]+" ");
            }
            System.out.println();
        }
    }
}
