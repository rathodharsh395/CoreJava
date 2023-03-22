package collectionFramework.queueImpl;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args) {
        //Priority
        Queue<String> queue = new PriorityQueue<>();
        // Front/Head ------> Rear/Tail

        //insertion from one end
        queue.offer("Amit");
        //queue.add("Akshay");
        queue.offer("Mijay");
        //queue.add("Gaurav");
        queue.offer("Vunjal");

        int queueSize = queue.size();
        for(int i=1;i<=queueSize;i++){
            System.out.println(queue.poll());
        }

        /*for(int i=1;i<=queueSize;i++){
            System.out.println(queue.remove());
        }*/
    }
}
