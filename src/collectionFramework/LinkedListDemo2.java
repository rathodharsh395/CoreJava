package collectionFramework;
import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        List list = new LinkedList();//container
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        System.out.println("After removal");
        list.remove(1);
        System.out.println(list);
        System.out.println("Delete all the elements of collection");
        list.clear();
        System.out.println(list);

    }
}
