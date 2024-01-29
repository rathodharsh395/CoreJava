package collectionFramework.listImpl;

import  java.util.*;
public class ArrayListSynchronization1{
    public static void main(String[] args){
        List<String> l= new ArrayList<String>();
        l.add("Apple");
        l.add("Orange");
        l.add("Banana");
        l.add("Pineapple");
        l.add("Guava");
        List<String> synlist= Collections.synchronizedList(l);
        synchronized(synlist){
            Iterator<String> itr= synlist.iterator();
            while(itr.hasNext()){
                String str= itr.next();
                System.out.println(str);
            }
        }
    }
}
