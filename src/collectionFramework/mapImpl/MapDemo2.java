package collectionFramework.mapImpl;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("V","Violet");
        map.put("I","Indigo");
        map.put("B","Blue");
        map.put("G","Green");
        map.put("Y","Yellow");
        map.put("O","Orange");
        map.put("R","Red");
        System.out.println(map);
        Set<String> keys = map.keySet();
        System.out.println("Set view of keys: "+keys);
        Collection<String> values= map.values();
        System.out.println("Collection view of values: "+values);

        String value = map.get("V");
        System.out.println(value);
        System.out.println(map.containsKey("B"));
        System.out.println(map.containsValue("Brown"));
    }
}
