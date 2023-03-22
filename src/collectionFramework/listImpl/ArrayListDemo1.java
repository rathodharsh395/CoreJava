package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        // can store homo/heterogeneous
        // duplicate
        // null*
        // Insertion order is maintained
        // growable array Data structure
        // best for retrival of data
        // Worst for modification of data
        System.out.println(list1.add(100));//return boolean
        list1.add(100);
        list1.add("abc");
        list1.add(null);
        list1.add(null);
        list1.add("abc");
        list2.add(200);
        list2.add(300);
        //list1.remove(100);CTE : IndexOutOfBoundsException
        list1.remove(null);
        System.out.println(list1.size());
        System.out.println(list1);
        list1.add(0,list2);// void
        System.out.println(list1);
        System.out.println(list1.addAll(0,list2));// return boolean
        System.out.println(list1);
        System.out.println(list1.get(2));// returns object



    }
}
