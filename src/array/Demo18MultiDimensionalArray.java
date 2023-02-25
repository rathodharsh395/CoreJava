package array;

import java.util.Scanner;

public class Demo18MultiDimensionalArray {
    public static void main(String[] args) {
       // Demo18MultiDimensionalArray ref= new Demo18MultiDimensionalArray();
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] addition = addMatrices(matrix1, matrix2);
        printMatrix(addition);

    }
    public static int[][] acceptMatrix(){
        Scanner hr= new Scanner(System.in);
        System.out.println("enter no of rows and column");
        int rows = hr.nextInt();
        int columns = hr.nextInt();
        int [][] matrix= new int[rows][columns];
        System.out.println("Enter the matrix elements");
        for(int row=0;row<matrix.length;row++) {
            for(int column = 0; column<matrix[row].length; column++) {
                matrix [row][column]=hr.nextInt();
            }
        }
        return matrix ;
    }
    private static int[][] addMatrices(int [][]mtx1,int[][] mtx2){
        int matrix[][]= new int[mtx1.length][mtx1[0].length];// this condition can also applied to rectangular matrix
        for(int row=0;row<matrix.length;row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = mtx1[row][column] + mtx2[row][column];
            }
        }
        return matrix;
    }
    private static void printMatrix(int[][] add){
        for(int row=0;row<add.length;row++){
            for(int column=0;column<add[row].length;column++){
                System.out.print(add[row][column]+" ");
            }
            System.out.println();
        }
     }

}
