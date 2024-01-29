package collectionFramework.mapImpl;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo3 {
    public static void main(String[] args) {
        final int max = 5;
        LinkedHashMap<String,String> lhmap =new LinkedHashMap<String,String>(){
          protected boolean  removeEldestEntry(Map.Entry<String,String> e){
              return size()>max;
          }
        };
        lhmap.put("R","Red");
        lhmap.put("G","Green");
        lhmap.put("B","Brown");
        lhmap.put("O","Orange");
        lhmap.put("P","Pink");
        System.out.println("Initial entries of LinkedHashMap");
        System.out.println(lhmap);
        lhmap.put("W","White");
        System.out.println("Map after adding more entry: "+lhmap);
        lhmap.put("Y","Yellow");
        System.out.println("Map after adding one more entry: "+lhmap);
    }
}
