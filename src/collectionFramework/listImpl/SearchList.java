package collectionFramework.listImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class SearchList {
    public static void main(String[] args) {
        List<Integer> integerList= new LinkedList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        System.out.println("Search "+integerList.contains(20));
        List<String> oldList = new ArrayList<>();
        oldList.add("India");
        oldList.add("US");
        oldList.add("UK");
        oldList.add("Italy");
        oldList.add("Singapore");
        System.out.println("Is Country there"+ oldList.contains("PAK"));
    }
}
