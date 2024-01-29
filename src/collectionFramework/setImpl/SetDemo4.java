package collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Red");
        set.add("Blue");
        set.add("Yellow");
        set.add("Green");
        System.out.println("1.Using Iterator");
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("2.Using for-each loop");
        for(String str:set){
            System.out.println(str);
        }
        System.out.println("3.Using forEach() method (Java 8)");
        set.forEach(System.out::println);
        System.out.println("4.Using stream API");
        set.stream().forEach(System.out::println);
    }
}
