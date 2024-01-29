package collectionFramework.mapImpl;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {
    public static void main(String[] args) {
        //1. LinkedHashMap maintains insertion order
        LinkedHashMap lhmap = new LinkedHashMap<>();
        lhmap.put("John",30);
        lhmap.put("Peter",25);
        lhmap.put("Ricky",23);
        lhmap.put("Deep",28);
        lhmap.put("Mark",32);
        System.out.println(lhmap);
        lhmap.put(null,null);
        System.out.println(lhmap);
        lhmap.remove("Deep");
        lhmap.replace("John",31);
        System.out.println(lhmap);
        System.out.println(lhmap.containsValue(null));

    }
}
