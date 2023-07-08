package array;

import java.util.Arrays;

// this program shows difference between copying reference to an array and copying array elements.
// it also demonstrates difference between == and equals()
public class Demo9ArrayCopy {
    public static void main(String[] args) {
        int [] array1= {100,200,10,12};
        int [] array2 = array1;// just a reference copy
        System.out.println(array1);//[I@1b6d3586
        System.out.println(array2);//[I@1b6d3586
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+",");
        }
        System.out.println(array1==array2);
        System.out.println(Arrays.equals(array1,array2));

        int [] array3 = new int[array1.length];
        for(int index=0 ; index<array1.length;index++){
            array3[index]=array1[index];
        }
        System.out.println("Printing the copied array");

        for(int index=0 ;index<array3.length;index++){
            System.out.print(array3[index]+",");
        }
        System.out.println(array3);//[I@1540e19d
        System.out.println(array1==array3);
        System.out.println(Arrays.equals(array1,array3));
    }
}
