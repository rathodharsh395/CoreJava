package multithreading;

class Q {
    int i;
    boolean valueSet = false;

    synchronized void produce(int i) {
        if (valueSet)
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        this.i = i;
        valueSet = true;
        System.out.println("Data Produced: " + i);
        notify();
    }

    synchronized int consume() {
        if (!valueSet)
            try {
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        System.out.println("Data Consumed " + i);
        valueSet = false;
        notify();
        return i;
    }
}
class Producer extends Thread{
    Q q;
    Producer(Q q){
        this.q = q;
    }
    public void run(){
        for(int j=1;j<=5;j++){
            q.produce(j);
        }
    }
}
class Consumer extends Thread{
    Q q;
    Consumer(Q q){
        this.q=q;
    }
    public void run(){
        for(int i=0;i<-5;i++)
        {
            q.consume();
        }
    }
}
public class ProducerConsumerProblem{
    public static void main(String[] args){
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.start();
        c.start();
    }
}