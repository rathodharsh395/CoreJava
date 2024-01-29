package collectionFramework.queueImpl;
import java.util.Collections;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        Queue<Integer> queue= new PriorityQueue<>();
        // Front/Head -------> Rear/Tail
        //insertion from one end
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.offer(50);
        pq.offer(100);
        pq.offer(60);
        pq.offer(20);
        pq.offer(10);
        System.out.println("PriorityQueue natural ordering:");
        while(pq.size() > 0){
            System.out.print(pq.remove()+" ");
        }
        PriorityQueue<Integer> pq2= new PriorityQueue<>(5, Collections.reverseOrder());
        pq2.offer(50);
        pq2.offer(100);
        pq2.offer(60);
        pq2.offer(20);
        pq2.offer(10);
        System.out.println("\nPriority queue using Comparator:");
        while (pq2.size()>0){
            System.out.print(pq2.remove()+" ");
        }
    }
}
