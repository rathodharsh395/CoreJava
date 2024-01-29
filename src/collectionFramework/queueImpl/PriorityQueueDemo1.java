package collectionFramework.queueImpl;
import java.util.Iterator;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        // Front/Head ------> Rear/Tail
        //insertion from one end
        queue.offer("USA");
        queue.offer("India");
        queue.offer("England");
        queue.offer("Germany");
        queue.offer("Australia");
        System.out.println(queue);

        Iterator<String> iterator= queue.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        while (queue.peek() !=null){
            System.out.println("\nHead Element: "+queue.peek());
            System.out.println("Removed Element from Queue: "+queue.remove());
            System.out.println("Priority queue: "+queue);
        }
    }
}
