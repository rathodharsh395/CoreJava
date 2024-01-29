package collectionFramework.mapImpl;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap lhmap = new LinkedHashMap();
        lhmap.put('R',"Red");
        lhmap.put('G',"Green");
        lhmap.put('B',"Brown");
        lhmap.put('O',"Orange");
        lhmap.put('P',"Pink");
        Iterator itr= lhmap.entrySet().iterator();
        System.out.println("Iterating entries of LinkedHashMap");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        Iterator itr2= lhmap.keySet().iterator();
        System.out.println("Iterating Keys of LinkedHashMap");
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        Iterator itr3= lhmap.values().iterator();
        System.out.println("Iterating Values of LinkedHashMap");
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }
    }
}
