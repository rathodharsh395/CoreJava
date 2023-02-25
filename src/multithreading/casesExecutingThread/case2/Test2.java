package multithreading.casesExecutingThread.case2;
//2. Performing Single task form multiple thread
public class Test2 {

    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread1 th2 = new MyThread1();
        MyThread1 th3 = new MyThread1();
        th1.start();
        th2.start();
        th3.start();
    }
}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("task 1");
    }
}