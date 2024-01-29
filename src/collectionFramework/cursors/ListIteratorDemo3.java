package collectionFramework.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo3 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList() ;
        al.add("Apple");
        al.add("Orange");
        al.add("Banaba");
        al.add("Guava");
        al.add("Pineapple");
        System.out.println(al);
        ListIterator litr= al.listIterator();
        while (litr.hasNext()){
            Object o=litr.next();
            String str= (String)o;
            if(str.equals("Orange")){
                litr.remove();
                System.out.println(al);
            }
            else if (str.equals("Guava")) {
                litr.add("Grapes");
                System.out.println(al);
            }
            else if (str.equals("Pineapple")) {
                litr.set("Pears");
                System.out.println(al);
            }
        }
    }
}
