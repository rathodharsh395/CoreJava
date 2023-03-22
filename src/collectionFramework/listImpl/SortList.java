package collectionFramework.listImpl;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class SortList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(101);
        integerList.add(2);
        integerList.add(310);
        integerList.add(41);
        integerList.add(23);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);

        List<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("US");
        countries.add("UK");
        countries.add("Italy");
        countries.add("Singapore");
        Collections.sort(countries);//sort
        System.out.println(countries);
    }
}
