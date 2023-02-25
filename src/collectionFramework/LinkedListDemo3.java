package collectionFramework;
import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        Product product = new Product();
        Student student = new Student(1,"HR","Nanded");
        String str = "xyz";

        List list = new LinkedList();
        list.add(str.toString());
        list.add(product.toString());
        list.add(student);
        System.out.println(list);

    }
}
