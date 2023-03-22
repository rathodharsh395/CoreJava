package collectionFramework.queueImpl;
import java.util.Queue;
import java.util.LinkedList;

public class LinkedListQueueDemo2 {
    public static void main(String[] args) {
        //FIFO: First In First Out
        Queue<String> queue = new LinkedList<>();
        // Front/Head ------>  Rear/Tail

        //insertion form one end
        /*queue.add("Amit");
        queue.add("Akshay");
        queue.add("Vijay");
        queue.add("Gaurav");
        queue.add("Munjal");*/

        //Inspection from one end
        System.out.println("Who is next for the ticket: "+queue.peek());//null
        //System.out.println("Who is next for the ticket: "+queue.element());//java.util.NoSuchElementException
        System.out.println("Size of the queue "+queue.size());// 0

        //Deletion from one end
        System.out.println("Deleted "+queue.poll());//null
       //System.out.println("Deleted "+queue.remove());//java.util.NoSuchElementException
        System.out.println("Size of the queue "+queue.size());

    }
}
