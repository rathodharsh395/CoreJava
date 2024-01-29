package collectionFramework.setImpl;

import java.util.TreeSet;

public class TreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(80);
        ts.add(05);
        ts.add(100);
        ts.add(90);
        ts.add(200);
        ts.add(300);
        System.out.println("Sorted TreeSet: "+ts);
        //Using methods of NavigableSet interface
        System.out.println("Largest element leas than 100: "+ts.lower(100));
        System.out.println("Smallest element greater than 100: "+ts.higher(100));
        System.out.println("Floor: "+ts.floor(85));
        System.out.println("Ceiling: "+ ts.ceiling(10));
        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());
        System.out.println("New TreeSet: "+ts);
        System.out.println("HeadSet: "+ts.headSet(90,true));
        System.out.println("SubSet: "+ts.subSet(90,true,200,true));
    }
}
