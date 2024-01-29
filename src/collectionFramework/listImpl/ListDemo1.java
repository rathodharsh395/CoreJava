package collectionFramework.listImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ListDemo1 {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(10);       // index based
        l.add(1,20);
        l.add(10);
        l.add(null);
        l.add(null);

//      System.out.println(l);
        Iterator itr = l.iterator();
        ListIterator it  = l.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        while(it.hasNext()){
            System.out.println(it.next());
            System.out.println(it.hasPrevious());
        }
    }
}
