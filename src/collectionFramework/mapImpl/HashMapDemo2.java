package collectionFramework.mapImpl;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap();
        hmap.put(5,"Five");
        hmap.put(10,"Ten");
        hmap.put(15,"Fifteen");
        hmap.put(20,"Twenty");
        hmap.put(25,"Twenty-five");
        hmap.put(30,"Thirty");
        Iterator<Map.Entry<Integer,String>> itr= hmap.entrySet().iterator();
        System.out.println("Iterating Entries of HashMap");
        while (itr.hasNext()){
            Map.Entry entry = itr.next();
            System.out.println("Key:"+entry.getKey()+",Value:"+entry.getValue());
        }
        System.out.println("Removing last entry returned by Iterator");
        itr.remove();
        System.out.println("Entries after removing: "+hmap.entrySet());

    }
}
