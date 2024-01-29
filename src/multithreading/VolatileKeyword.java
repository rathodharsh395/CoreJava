package multithreading;

 class A extends Thread
{
    // Declare a volatile variable named flag with initial value true.
    public volatile boolean flag = true;

    @Override
    public void run(){
        System.out.println("Thread starts running");

// Since the flag is volatile, so for every read, thread will read its latest value from main memory.
        while(flag)
        {
            try{
                System.out.println("Thread going to sleep");
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
        System.out.println("Thread stopped...");
    }
    public void stopThread(){
        this.flag = false;
    }
}
public class VolatileKeyword {
    public static void main(String[] args) {
        A a = new A();
        Thread t = new Thread(a);
        t.start(); // Thread started.

        try {
            Thread.sleep(3000); // Main thread will sleep for 3 seconds.
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
// Stop thread.
// Call stopThread() using reference variable a.
        a.stopThread();
    }
}
