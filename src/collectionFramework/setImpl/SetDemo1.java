package collectionFramework.setImpl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {

        Set  s = new HashSet();
        s.add(300);   // hash code based
        s.add(200);
        s.add(100);
        s.add("ram");
        s.add(null);
        s.add("Abhishek");
        System.out.println("Size before adding duplicate: "+s.size());
        s.add(300);   // duplicate
        s.add(null);
        System.out.println("Size after adding duplicate: "+s.size());

        System.out.println(s.equals(100));
        System.out.println(s.contains(null));
        System.out.println("Not maintained the insertion order");
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");

        }
        s.remove(null);
        System.out.println("\n"+s);

        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.print(it.next().hashCode()+" ");
        }

    }
}
