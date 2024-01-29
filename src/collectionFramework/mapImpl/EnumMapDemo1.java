package collectionFramework.mapImpl;

import fileHandling.Demo1CreateNewFile;

import java.util.EnumMap;

public class EnumMapDemo1 {
    public enum Days{ Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};

    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Days.class);
        enumMap.put(Days.Monday,"Day 2");
        enumMap.put(Days.Tuesday,"Day 3");
        enumMap.put(Days.Sunday,"Day 1");
        enumMap.put(Days.Wednesday,"Day 4");
        enumMap.put(Days.Saturday,"Day 7");
        enumMap.put(Days.Thursday,"Day 5");
        enumMap.put(Days.Friday,"Day 6");
        System.out.println("Entries of enum map: "+enumMap.entrySet());
        System.out.println("Keys of enum map: "+enumMap.keySet());
        System.out.println("Values of enum map: "+ enumMap.values());
        System.out.println("Value of Saturday: "+enumMap.get(Days.Saturday));

    }
}
