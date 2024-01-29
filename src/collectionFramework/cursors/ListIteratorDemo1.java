package collectionFramework.cursors;
import java.util.*;
public class ListIteratorDemo1{
    public static void main(String[] args){
        List<String> list= new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");
        list.add("Blue");
        System.out.println("List"+list);
        ListIterator itr = list.listIterator();
        System.out.println();
        System.out.println("List Iterator in Forward Direction");
        while(itr.hasNext()) {
            int index = itr.nextIndex();
            String element = (String)itr.next();
            System.out.println("Index= " + index + ",Element= "+ element);
        }
        System.out.println("List Iterator in Backward Direction");
        while(itr.hasPrevious()){
            int index = itr.previousIndex();
            String element = (String)itr.previous();
            System.out.println("Index= "+ index + ",Element= "+ element);
        }
    }
}
