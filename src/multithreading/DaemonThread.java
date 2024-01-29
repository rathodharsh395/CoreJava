package multithreading;

public class DaemonThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {

//      System.out.println("main thread");
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true);
        dt.start();

//      Thread.currentThread().setDaemon(true);// Exception in thread "main" java.lang.IllegalThreadStateException

        DaemonThread dt1 = new DaemonThread();
        dt1.start();
//      dt1.setDaemon(true); // Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
