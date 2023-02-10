package Array;

public class Demo1 {
    public static void main(String[] args) {
        // if we specify the array size in negative we get the NegativeArraySizeException
        //way 1: in this all the array elements will be initialized with default value
        //int arry [] = new int[];//CTE:java: array dimension missing
        //System.out.println(arry);
        int [] array = new int[0];
        System.out.println(array);//[I@1b6d3586
        /*System.out.println(array[0]);
        Run Time Error:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Array.Demo1.main(Demo1.java:11)
        array[0] = 5;
        System.out.println(array[0]);
        Run Time Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Array.Demo1.main(Demo1.java:15)*/
        int ary[] = new int [1];
        System.out.println(ary);//[I@4554617c
        System.out.println(ary[0]);//default value: 0
        ary[0] = 5;
        System.out.println(ary[0]);//Your own value: 5
        /*int ar[] = new int[-1];
        Run Time Error: Exception in thread "main" java.lang.NegativeArraySizeException
        at Array.Demo1.main(Demo1.java:23)*/

        //way 2: in this array elements will be initialized with the specified values
        int array2[]= {1,2,3,4,
                       5,6,7,9};

        //way 3: array declaration + array initialization
        int [] array3;//array declaration
        //array3 = {1,2,3};//CTE: java: illegal start of expression
        array3 = new int[10];// array initialization
        System.out.println(array3);//[I@74a14482

        /* whenever we create an array,
           we create an object inside the heap
           and all the array elements will be stored as part of the object sequentially
        */

    }
}
