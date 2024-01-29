package collectionFramework.mapImpl;
import java.util.HashMap;
import java.util.Map;

// Iterating map Using forEach() method & lambda expression (java 8)
public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("India","Delhi");
        map.put("USA","Washington D.C");
        map.put("Australia","Canberra");
        map.put("New zealand","Wellington");
        map.put("Switzerland","Bern");
        map.forEach((k,v)-> System.out.println("Country:"+k+",Capital:"+v));
    }
}
