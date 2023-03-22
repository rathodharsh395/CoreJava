package array;
// printing Jagged_array
public class Demo15PrintingJaggedArray {
    public static void main(String[] args) {
        int [] [] arrayOfArray = {
                {10,20},
                {30,40,50},
                {70,80,90,100}
        };
        //to print jagged_array
        for(int row=0;row<arrayOfArray.length;row++){
            for(int column=0;column<arrayOfArray[row].length;column++){
                System.out.print(arrayOfArray[row][column]+" ");
            }
            System.out.println();
        }
    }
}
