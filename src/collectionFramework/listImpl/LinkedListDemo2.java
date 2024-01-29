package collectionFramework.listImpl;
import java.util.Deque;
import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo2 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();//container
        list.add(10);
        list.add(20);
        list.add("A");
        list.add(2,10);
        list.add(20);
        list.add("A");
        list.addFirst("Sanjana");
        list.addLast("rathod");
        System.out.println(list);
        System.out.println("get(3): "+list.get(3));
        System.out.println("getFirst(): "+list.getFirst());
        System.out.println("peekFirst(): "+list.peekFirst());
        System.out.println("getLast(): "+list.getLast());
        System.out.println("peekLast(): "+list.peekLast());
        System.out.println("list.size(): "+list.size());
        list.set(0,"A");
        System.out.println("After set: "+list);
        list.remove(2);
        System.out.println("After remove(2): "+list);
        list.pollFirst();
        System.out.println("After pollFirst(): "+list);
        list.pollLast();
        System.out.println("After pollLast(): "+list);
        list.removeFirst();
        System.out.println("After removeFirst(): "+list);
        list.removeLast();
        System.out.println("After removeLast(): "+list);
        list.removeLastOccurrence(10);
        System.out.println("After removeLastOccurrence(10): "+list);
        System.out.println("Delete all the elements of collection");
        list.clear();
        System.out.println(list);
        list.push("B");
        System.out.println(list);
        list.pop();
        System.out.println(list);

    }
}
