package array;

import java.util.HashSet;

public class CommonElementsInTwoArray2 {
    public static void main(String[] args) {
        int arr1[] = {4,5,2,3,4,6,1};
        int arr2[] = {9,5,4,3,4,1,5};
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int a:arr1) {
            hs1.add(a);
        }
        for (int b:arr2) {
            hs2.add(b);
        }
        for(int no:hs2){
           boolean p = hs1.add(no);
           if(p==false){
               System.out.println(no);
           }
        }
    }
}
