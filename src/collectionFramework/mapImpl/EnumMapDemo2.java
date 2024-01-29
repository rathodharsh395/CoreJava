package collectionFramework.mapImpl;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public class EnumMapDemo2 {
    public enum Cartoon{ Hatodi,Shinchan,Tom,Jerry,Seero,Ben};
    public static void main(String[] args) {
        EnumMap<Cartoon,String> enumMap = new EnumMap(Cartoon.class);
        enumMap.put(Cartoon.Jerry,"Mouse");
        enumMap.put(Cartoon.Ben,"Hero");
        enumMap.put(Cartoon.Hatodi,"Ninja");
        enumMap.put(Cartoon.Shinchan,"Boy");
        enumMap.put(Cartoon.Tom,"Cat");
        enumMap.put(Cartoon.Seero,"Dog");
        Iterator<Map.Entry<Cartoon,String>> itr = enumMap.entrySet().iterator();
        System.out.println("Iterating entries in enum map");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
