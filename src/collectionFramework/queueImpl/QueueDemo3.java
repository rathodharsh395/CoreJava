package collectionFramework.queueImpl;
import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo3 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(50);
        q.offer(60);
        q.add(20);
        q.offer(10);
        q.offer(50); //same working
        System.out.println(q);
        System.out.println("q.element(): "+q.element());
        System.out.println("q.remove(): "+q.remove());
        System.out.println(q);
        System.out.println("q.remove(): "+q.remove());
        System.out.println(q);
        System.out.println("q.offer(100): "+q.offer(100));
        System.out.println(q);
        System.out.println("q.remove(): "+q.remove());
        System.out.println(q);
    }
}
