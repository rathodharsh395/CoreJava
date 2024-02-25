package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        System.out.print("Using for loop\n");
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i));
        }
        System.out.println("\nUsing for-each loop");
        for(String str:al){
            System.out.print(str);
        }
        System.out.println("\nUsing Iterator");
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
        System.out.println("\nUsing ListIterator");
        ListIterator litr= al.listIterator();
        while (litr.hasNext()){
            System.out.print(litr.next());
        }
        System.out.println("\nUsing forEach() method and method references");
        al.forEach(System.out::print);

        System.out.println("\nUsing Stream API (Java 8)");
        al.stream().forEach(System.out::print);

    }
}
