package java8Features.methodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferences3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("vicky");
        list1.add("poonam");
        list1.add("sachin");
        list1.add("Vicky");
        list1.add("Poonam");
        List<String> list2 = new ArrayList<>(list1);

        System.out.println("sort using lambda");
        list1.sort( (a,b)-> a.compareToIgnoreCase(b) );
        list1.forEach(System.out::println);

        System.out.println("sort using method references");
        list2.sort( String::compareToIgnoreCase);
        list2.forEach(System.out::println);
    }
}
