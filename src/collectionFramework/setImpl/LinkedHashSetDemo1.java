package collectionFramework.setImpl;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        //1. unique: no duplicates
        //2. insertion order
        //3. no sorting order
        //4. can store homogeneous
        //5. can store heterogeneous
        //6. can store null(1)
        //7. to maintain the uniqueness of elements it uses internally equals() and hashCode()
        //8. internally it uses LinkedHashMap

        Set set = new LinkedHashSet();
        set.add(100);
        set.add(100);
        set.add(10);
        set.add("abc");
        set.add("xyz");
        set.add(null);
        set.add(null);
        set.add('A');

        System.out.println(set);
        System.out.println(set.size());
    }
}
