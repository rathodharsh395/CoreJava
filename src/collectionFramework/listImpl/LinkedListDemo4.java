package collectionFramework.listImpl;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class LinkedListDemo4 {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("White");
        list.add("Pink");
        System.out.println("1.Using for loop");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("2.Using for each loop");
        for(Object str: list){
            System.out.println((String)str);
        }
        System.out.println("3.Using Iterator");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("4.Using ListIterator: forward direction");
        ListIterator litr= list.listIterator();
        while(litr.hasNext()) {
            System.out.println(litr.next());
        }
        System.out.println("backward direction");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
        System.out.println("5.Using forEach() method and lambda expression");
        list.forEach(a-> System.out.println(a));

        System.out.println("6.Using Stream API (Java 8)");
        list.stream().forEach(System.out::println);
    }
}
