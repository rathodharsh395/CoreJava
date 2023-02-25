package array;

public class Demo2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};//'array' is a reference variable: contains the address/reference of an object
        System.out.println(array);//print the object address/reference: hashcode: [I@1b6d3586
        System.out.println("First element of the array\t"+array[0]);//1
        System.out.println("how many elements are there in the given array: Size of an array\t"+
                           array.length);//5
        // index for an 5 element array : 0,1,2,3,4
        for(int index = 0 ; index<array.length;index++){
            System.out.println(array[index]);
        }
    }
}
