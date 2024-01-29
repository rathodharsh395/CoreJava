package collectionFramework.mapImpl;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap= new TreeMap<>();
        tmap.put(25,"John");
        tmap.put(22,"Shubh");
        tmap.put(30,"Ricky");
        tmap.put(35,"Peter");
        tmap.put(18,"Johnson");
        System.out.println("ceilingEntry:"+tmap.ceilingEntry(32));
        System.out.println("ceilingKey:"+tmap.ceilingKey(32));
        System.out.println("fistEntry:"+tmap.firstEntry());
        System.out.println("lastEntry:"+tmap.lastEntry());
        System.out.println("floorEntry:"+tmap.floorEntry(31));
        System.out.println("HigherEntry:"+tmap.higherEntry(30));
        System.out.println("LowerEntry:"+tmap.lowerEntry(30));
//        System.out.println("pollFirstEntry:"+tmap.pollFirstEntry());
//        System.out.println("pollLastEntry:"+tmap.pollLastEntry());
        System.out.println("\n");
        // Using methods of NavigableMap interface
        System.out.println("Descending order of tree map:"+tmap.descendingMap());
        System.out.println("headMap:"+tmap.headMap(22,true));
        System.out.println("tailMap:"+tmap.tailMap(22,true));
        System.out.println("subMap:"+tmap.subMap(18,false,35,true));
        System.out.println("\n");
        // Using methods of SortedMap interface
        System.out.println("headMap:"+tmap.headMap(40));
        System.out.println("tailMap:"+tmap.tailMap(22));
        System.out.println("subMap:"+tmap.subMap(19,25));
    }

}
