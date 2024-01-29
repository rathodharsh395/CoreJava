package multithreading.way2ImplementingRunnable;

public class ImplementingRunnable implements Runnable {

    public void run(){
        System.out.println("thread task");
    }
//    public void run(String s){
//        System.out.println("argumented run");
//    }
//    public void start(){
//        System.out.println("start");
//    }
    public static void main(String[] args) {
        ImplementingRunnable i = new ImplementingRunnable();
        Thread t = new Thread(i);
        t.start();
    }
}
