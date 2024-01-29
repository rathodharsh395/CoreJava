package collectionFramework.setImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add(5);
        list.add(15);
        list.add(15);
        list.add(20);
        list.add(20);
        list.add(10);
        list.add(30);
        System.out.println("Original order of List Elements");
        System.out.println(list);
        Set s = new HashSet(list);
        System.out.println("New List inside Set");
        System.out.println(s);

    }
}
