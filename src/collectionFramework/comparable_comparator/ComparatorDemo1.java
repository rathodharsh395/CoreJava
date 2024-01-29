package collectionFramework.comparable_comparator;
import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo1 {
    public static void main(String[] args) {
        ArrayList<Emp> al1 = new ArrayList<Emp>();
        al1.add(new Emp("Durgesh","9146698128",12));
        al1.add(new Emp("Ankit","384839338",11));
        al1.add(new Emp("Bhavesh","9421839936",45));
        System.out.println("Original list:");
        System.out.println(al1);
        Collections.sort(al1,new IdComparator());
        System.out.println("Sorting by empId:");
        System.out.println(al1);

        ArrayList<Emp> al2 = new ArrayList<>(al1);
        Collections.sort(al2,new NameComparator());
        System.out.println("Sorting by empName:");
        System.out.println(al2);
    }
}
