package array;

public class Demo5AIOBE {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7};
        //System.out.println(arr[5]);
        /*Run Time Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at Array.Demo5AIOBE.main(Demo5AIOBE.java:6)*/
        int array[] = new int[4];
        array[3]=10;
        System.out.println(array[3]);
        array[4]= 20;
        //System.out.println(array[4]);
        /*Run Time Error:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at Array.Demo5AIOBE.main(Demo5AIOBE.java:12)*/

    }
}
