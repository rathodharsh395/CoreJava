package collectionFramework.queueImpl;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("ABC");
        q.offer("DEF");// same working
        q.offer("GHI");
        q.offer("JKL");
        q.add("MNO");
        System.out.println("Elements is q: "+q);
        System.out.println("Head element of queue: "+q.element());
        System.out.println("Removed Element: "+q.remove());
        System.out.println("Element in queue after removed: "+q);
        q.offer("PQR");
        System.out.println("Element added to the tail of queue: "+q);
    }
}
