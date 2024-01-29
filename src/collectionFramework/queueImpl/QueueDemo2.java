package collectionFramework.queueImpl;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo2 {
    public static void main(String[] args) {
        Queue<Integer> q= new PriorityQueue<>();
        System.out.println("Is queue empty: "+q.isEmpty());
        System.out.println("q.peek(): "+q.peek());
        System.out.println("q.poll(): "+q.poll());
        q.add(10);
        q.offer(20);
        q.offer(10);// same working
        q.offer(25);
        q.add(50);
        System.out.println("Size of queue: "+q.size());
        System.out.println("Original elements in queue: "+q);
        System.out.println("Removed (on priority): "+q.remove());
        System.out.println("Elements in queue: "+q);
        System.out.println("Adding in queue: "+q.offer(9));
        System.out.println("Elements is queue: "+q);
        System.out.println("Removed (on priority): "+q.remove());
        System.out.println("Elements in queue: "+q);
        System.out.println("Head element of queue: "+q.peek());
        System.out.println("Elements in queue: "+q);
    }
}
