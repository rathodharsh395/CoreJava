package collectionFramework.setImpl;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(25);
        ts.add(80);
        ts.add(05);
        ts.add(100);
        ts.add(90);
        System.out.println("1.Using for each loop");
        for(Integer i:ts) {
            System.out.println(i);
        }
        System.out.println("2.Using iterator");
        Iterator itr=ts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("3.Using descendingIterator");
        Iterator it =ts.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
