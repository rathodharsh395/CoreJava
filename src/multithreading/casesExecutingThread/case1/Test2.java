package multithreading.casesExecutingThread.case1;
//1. Performing Single task form single thread
class MyThread extends Thread{
    public void run(){
        System.out.println("task 1");
    }
}
public class Test2 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
