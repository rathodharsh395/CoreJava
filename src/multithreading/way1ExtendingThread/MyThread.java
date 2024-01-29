package multithreading.way1ExtendingThread;

public class MyThread extends Thread{
    public void run() {
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());

        MyThread th = new MyThread();
        th.start();
    }
}
