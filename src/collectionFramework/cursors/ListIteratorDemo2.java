package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("List: "+list);
        ListIterator litr= list.listIterator();
        System.out.println("Forward Direction Iteration:");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        litr.add("E");
        System.out.println(list);
        System.out.println("Backward Direction Iteration:");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        litr.set("J");
        System.out.println(list);
//      itr.add("K");
        litr.remove();
        System.out.println(list);
    }
}
