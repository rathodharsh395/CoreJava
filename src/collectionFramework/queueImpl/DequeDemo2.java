package collectionFramework.queueImpl;
import java.util.ArrayDeque;
import java.util.Deque;

// Deque as Stack (LIFO)
public class DequeDemo2 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.push("John");
        dq.push("Richard");
        dq.push("Donna");
        dq.push("Ken");
        dq.push("Peter");
        System.out.println("Deque: "+dq);
        while (dq.peek() != null){
            System.out.println("Element at top: "+dq.peek());
            System.out.println("Popped: "+dq.pop());
            System.out.println("Elements in Deque:"+dq);
        }
        System.out.println("Is Deque empty: "+dq.isEmpty());
    }
}
