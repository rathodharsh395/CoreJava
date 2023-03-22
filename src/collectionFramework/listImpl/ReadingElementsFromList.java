package collectionFramework.listImpl;
import java.util.List;
import java.util.LinkedList;
import java.util.function.Consumer;
public class ReadingElementsFromList {
    public static void main(String[] args) {
        List<Integer> integerList=new LinkedList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        //integerList.add("abc"); CTE
        //1. for loop
        for(int index= 0; index<integerList.size();index++){
            System.out.print(integerList.get(index));
        }
        //2. for each
        System.out.println("for each way");
        for(Integer i:integerList){
            System.out.print(i+" ");
        }
        //3. cursor
        //4. java 8
        System.out.println("java 8 way");
        Consumer<Integer> integerConsumer = (integer)-> System.out.print(integer+" ");
        integerList.forEach(integerConsumer);

        //5. java 8 way
        System.out.println("java 8 method ref way");
        integerList.forEach(System.out::println);
    }
}
