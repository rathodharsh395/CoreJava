package multithreading.casesExecutingThread.case4;
//4. Performing Multiple task from multiple thread
class MyThread1 extends Thread{
    public void run(){
        System.out.println("Video");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("Music");
    }
}
class MyThread3 extends Thread{
    public void run(){
        System.out.println("Progress bar is executing");
    }
}
public class Test {
    public static void main(String[] args) {
        MyThread1 mt1= new MyThread1();
        MyThread2 mt2 = new MyThread2();
        MyThread3 mt3 = new MyThread3();
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
