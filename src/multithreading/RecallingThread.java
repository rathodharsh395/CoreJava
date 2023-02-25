package multithreading;
//Override run method is not compulsory
public class RecallingThread extends Thread{
    public void run(){
        System.out.println("thread task");
    }
    public static void main(String[] args) {
        RecallingThread rt = new RecallingThread();
        rt.start();
        rt.start();//Unchecked Exception//
        /*Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:710)
	at multithreading.RecallingThread.main(RecallingThread.java:10) */



    }
}
