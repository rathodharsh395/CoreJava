package multithreading;

public class PriorityThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread());

    }
    public static void main(String[] args){
        PriorityThread p = new PriorityThread();
        Thread t1 = new Thread(p,"thread1");
        Thread t2 = new Thread(p,"thread2");
        Thread t3 = new Thread(p,"thread3");
        t1.setPriority(4);
        t2.setPriority(1);
        t3.setPriority(9);

        System.out.println(Thread.currentThread().getPriority());
        t1.start();
        t2.start();
        t3.start();

        //But it is not necessary that you will get the same output when you will run multiple times.
    }
}
