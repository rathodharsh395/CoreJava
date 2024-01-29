package collectionFramework.queueImpl;
import java.util.*;
// Deque as FIFO (simple as a queue)
public class DequeDemo1{
    public static void main(String[] args){
        Deque<String> dq= new LinkedList<>();
        dq.addLast("John");
        dq.addLast("Richard");
        dq.addLast("Donna");
        dq.addLast("Ken");
        dq.addLast("Peter");
        System.out.println("Deque: "+dq);
        while(dq.peekFirst() !=null){
            System.out.println("Head Element:"+ dq.peekFirst());
            System.out.println("Removed element from Deque:"+dq.removeFirst());
            System.out.println("Elements in Deque:"+dq);
        }
        System.out.println("deque.isEmpty():"+dq.isEmpty());
        System.out.println("deque.peekFirst():"+dq.peekFirst());
        System.out.println("deque.pollFirst():"+dq.pollFirst());
        try{
            String str= dq.getFirst();
            System.out.println("deque.getFirst():"+str);
        }
        catch(NoSuchElementException e){
            e.printStackTrace();
        }
        try{
            String str= dq.removeFirst();
            System.out.println("deque.removeFirst():"+str);
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
}
