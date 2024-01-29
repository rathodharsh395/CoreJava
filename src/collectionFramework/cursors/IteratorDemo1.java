package collectionFramework.cursors;

import java.util.*;
public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            al.add(i);
        }
        System.out.println(al);
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i);
            if (i % 2 != 0) {
                itr.remove();
            }
        }
        System.out.println(al);

    }
}
