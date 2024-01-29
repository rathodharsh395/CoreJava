package collectionFramework.listImpl;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
public class ArrayListSynchronization2{
    public static void main(String[] args){
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
        al.add("A");
        al.add("B");
        al.add(null);
        al.add("D");
        al.add("E");
        System.out.println(al);
        List<String> synlist= Collections.synchronizedList(al);
        Iterator<String> itr= synlist.iterator();
        while(itr.hasNext()){
            al.set(4,"F");
            String str= itr.next();
            System.out.println(str);
        }
        System.out.println(al);
    }
}