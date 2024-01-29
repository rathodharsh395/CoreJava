package collectionFramework.mapImpl;

import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        //1.unique keys
        //2.no insertion order for keys
        //3.sorting order for keys
        //4.keys can be only homogeneous
        //5.null insertion at key place allowed even once.
        //6.To maintain the uniqueness of keys it uses, compare or compareTo
        //7.no restrictions for values
        TreeMap tmap = new TreeMap();
        tmap.put('A',"Apple");
        tmap.put('P',"Parot");
        tmap.put('C',"Cat");
        tmap.put('B',null);
        tmap.put('D',"Dog");
//      tmap.put(null,"Value"); // NullPointerException
        System.out.println("Entry set:"+tmap.entrySet());
        System.out.println("Key set:"+tmap.keySet());
        System.out.println("Value set:"+tmap.values());
        System.out.println("C:"+tmap.get('C'));
        System.out.println("Is key 'B' present in map:"+tmap.containsKey('B'));
        System.out.println("Is Apple present in map:"+tmap.containsValue("Apple"));

    }
}
