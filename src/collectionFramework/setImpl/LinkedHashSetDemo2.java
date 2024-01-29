package collectionFramework.setImpl;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,8,7,6};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        System.out.println("Original list: "+ al);
        LinkedHashSet lhset = new LinkedHashSet(al);
        System.out.println("New list in LinkedHashSet: "+lhset);
    }
}
