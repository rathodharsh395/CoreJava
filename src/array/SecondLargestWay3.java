package array;

import java.util.Arrays;

public class SecondLargestWay3 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 6, 2, 5, 3};
        int arr2[] = {1};
        int n1 = arr1.length;
        int n2 = arr2.length;
        getElements(arr1, n1);
        getElements(arr2, n2);
    }
    public static void getElements(int arr[], int n) {
        if(n == 0 || n==1){
            System.out.println("Single element cannot compare");
        }
        else{
            Arrays.parallelSort(arr);
            int small= arr[1];
            int large= arr[n-2];
            System.out.println("Second samallest is: "+small);
            System.out.println("Second Largest is: "+large);
        }
    }

}
