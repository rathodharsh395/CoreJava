package java8Features.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        //Consumer to display a number
        Consumer<Integer> display = (a)-> System.out.println(a);

        //implement display using accept()
        display.accept(10);

        //consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> modify = list ->{
            for(int i= 0; i < list.size();i++)
                list.set(i, 2* list.get(i));
        };
        //Consumer to display a list of numbers
        Consumer<List<Integer>> dispList = list-> list.forEach(a->System.out.print(a+" "));

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        //implement modify using accept()
        modify.accept(list);
        //implement dispList using accept()
        dispList.accept(list);

    }
}
