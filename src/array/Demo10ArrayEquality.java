package array;

import java.util.Arrays;

public class Demo10ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {100,200,10,12};
        int[] array2 = {100,200,10,12};
        System.out.println("Array's are equal: "+ arrayEquals(array1,array2));
        boolean equal = Arrays.equals(array1,null);
        System.out.println("with equlas method of Array class: "+equal);
    }
    public static boolean arrayEquals(int[] arry1 , int[] arry2) {
        if (arry1 == arry2) {
            return true;
        } //check that whether both are pointing to same object or both to null
        //null check : either one of them is pointing to null
        if (arry1 == null || arry2 == null) {
            return false;
        }
        //length check
        if(arry1.length != arry2.length){
            return false;
        }
        //content should be equal
        for(int index = 0; index<arry2.length;index++){
            if(arry1[index]!=arry2[index]){
                return false;
            }
        }
        return true;
    }
}
