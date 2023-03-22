package collectionFramework.queueImpl;

import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueueDemo1 {
    public static void main(String[] args) {
        //FIFO: First In First Out
        Queue<String> queue = new LinkedList<>();
        // Front/Head -----> Rear/Tail

        //insertion from one end
        queue.offer("Amit");
        queue.offer("Akshay");
        queue.add("Vijay");
        queue.add("Gaurav");
        queue.add("Munjal");

        //Inspection from one end
        System.out.println("Who is next for the ticket: "+queue.peek());
        System.out.println("Size of the queue "+queue.size());

        //Deletion from one end
        System.out.println("Deleted "+queue.remove());
        System.out.println("Size of the queue "+queue.size());

    }
}

