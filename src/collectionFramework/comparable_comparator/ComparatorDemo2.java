package collectionFramework.comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Ascend implements Comparator<Integer> {
    @Override
    public int compare(Integer i1,Integer i2){
        return i1.compareTo(i2);
    }
}
class Descend implements Comparator<Integer>{
    @Override
    public int compare(Integer i1,Integer i2){
        return i2.compareTo(i1);
    }
}
public class ComparatorDemo2 {
    public static void main(String[] args) {
        Ascend as = new Ascend();
        Descend ds = new Descend();
        TreeSet<Integer> ts1 = new TreeSet<>(as);
        ts1.add(12);
        ts1.add(10);
        ts1.add(11);
        TreeSet<Integer> ts2 = new TreeSet<>(ds);
        ts2.add(12);
        ts2.add(10);
        ts2.add(11);
        System.out.println("Ascend set:"+ts1);
        System.out.println("Descending set:"+ts2);

    }
}
