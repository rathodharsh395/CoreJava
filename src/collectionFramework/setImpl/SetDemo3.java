package collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add("A");
        s1.add("B");
        s1.add("C");
        Set s2 = new HashSet();
        s2.add("A");
        s2.add("B");
        s2.add("D");
//        s1.addAll(s2);
//        System.out.println(s1);

//        s1.add(s2);
//        System.out.println(s1);

//        s1.removeAll(s2);
//        System.out.println(s1);

//        s1.remove(s2);
//        System.out.println(s1);

//        s1.retainAll(s2);
//        System.out.println(s1);

//        s1.clear();
//        System.out.println(s1.size());

        s2.add("A");
        System.out.println(s2.size());


    }
}
