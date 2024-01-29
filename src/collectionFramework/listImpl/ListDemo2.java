package collectionFramework.listImpl;

import java.util.ArrayList;
import java.util.List;
public class ListDemo2{
    public static void main(String[] args){
        List<String> al= new ArrayList<>();
        al.add("Apple");
        al.add("Mango");
        al.add("Orange");
        System.out.println("List1 contain: "+al);
        List<String> al2 = new ArrayList<>();
        al2.add("11");
        al2.add("12");
        System.out.println("List2 contain: "+al2);
        al.addAll(2,al2);
        System.out.println("List1 after adding List2: "+al);
        System.out.println(al.get(2));
    }
}
