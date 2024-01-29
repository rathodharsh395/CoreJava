package collectionFramework.setImpl;

import java.util.ArrayList;
import java.util.HashSet;
public class HashSetDemo2 {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("Monday");
        al.add("Tuesday");
        al.add("Wednesday");
        al.add("Thursday");
        al.add("Friday");
        al.add("Friday");// duplicates
        al.add("Monday");
        System.out.println("Does set has Sunday: "+ al.contains("Sunday"));
        System.out.println("Original elements order:");
        System.out.println(al);
        HashSet hset= new HashSet();
        hset.addAll(al);
        System.out.println("HashSet elements:");
        System.out.println(hset);

    }
}
