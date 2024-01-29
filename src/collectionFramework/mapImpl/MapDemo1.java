package collectionFramework.mapImpl;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        System.out.println("Is map empty? "+ map.isEmpty());
        map.put(101,"Red");
        map.put(103,"Green");
        map.put(102,"Yellow");
        map.put(106,"Pink");
        map.put(104,"Red");   // duplicate value
        map.put(106,"Purple");// duplicate key
        System.out.println("No of entries: "+ map.size());
        System.out.println("Entries in Map: "+map);

        map.replace(102,"Orange");
        map.replace(104,"Red","Blue");
        map.remove(103);
        map.remove(106,"Purple");

        Map map2 = new HashMap();
        map.put(115,"Brown");
        map.put(120,"Purple");
        map.put(125,"Green");

        map.putAll(map2);
        System.out.println("Entries in Updated map: "+map);

        map.clear();
        System.out.println("After clear(): "+ map);
    }
}
