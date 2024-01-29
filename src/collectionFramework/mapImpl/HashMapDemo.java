package collectionFramework.mapImpl;
import java.util.Map;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Map map= new HashMap();
        //1. unique keys
        //2. no insertion order for keys
        //3. no sorting order for keys
        //4. keys can be homogeneous as well as heterogeneous
        //5. null insertion at key place is possible only once.
        //6. To maintain the uniqueness of keys it uses, equals and hashCode
        //7. no restrictions for values
        map.put("ganesh",57);
        map.put("ganesh",58);
        map.put("sachin",87);
        map.put(null,55);
        map.put(null,null);
        map.put("arjun",97);

        System.out.println("No. of entries in the map "+map.size());
        System.out.println("Set view of Keys:"+map.keySet());
        System.out.println("Collection view of Values:"+map.values());
        System.out.println("Get value :"+ map.get("ram"));
        System.out.println("Removing :"+ map.remove("arjun"));
        System.out.println(map);

    }
}
