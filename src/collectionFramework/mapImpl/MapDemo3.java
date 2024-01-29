package collectionFramework.mapImpl;
import java.util.*;
// Iterating map
public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap();
        map1.put("V","Violet");
        map1.put("I","Indigo");
        map1.put("B","Blue");
        map1.put("G","Green");
        map1.put("Y","Yellow");
        // 1. Using iterator()
        Iterator<Map.Entry<String,String>> itr1 = map1.entrySet().iterator();
        System.out.println("Iterating Entries of Map");
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        Iterator<String> itr2 = map1.keySet().iterator();
        System.out.println("Iterating Keys of Map");
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        Iterator<String> itr3 = map1.values().iterator();
        System.out.println("Iterating Values of Map");
        while(itr3.hasNext()){
            System.out.println(itr3.next());
        }
        // 2. Using for-each loop
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(101,"John");
        map2.put(202,"Ricky");
        map2.put(303,"Deep");
        map2.put(404,"Mark");
        map2.put(505,"Maya");
        Set<Map.Entry<Integer,String>> entries = map2.entrySet();
        System.out.println("Iterating entries of Map");
        for(Map.Entry entry: entries){
            System.out.println(entry);
        }
        Set<Integer> keys = map2.keySet();
        System.out.println("Iterating Keys of Map");
        for(Integer key: keys){
            System.out.println(key);
        }
        Collection<String> values = map2.values();
        System.out.println("Iterating Values of Map");
        for(String value: values){
            System.out.println(value);
        }
    }
}
