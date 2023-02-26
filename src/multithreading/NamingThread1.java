package multithreading;

public class NamingThread1 extends Thread {
    public void run(){
        System.out.println("run Method: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        System.out.println("hello :"+Thread.currentThread().getName());
        NamingThread1 n1= new NamingThread1();//Name By default: Thread-0
        NamingThread1 n2= new NamingThread1();//Name By default: Thread-1
        n1.start();
        n2.start();
        //n2.setName("MyThread");
        System.out.println("main:"+Thread.currentThread().isAlive());
        System.out.println("n1:"+n1.isAlive() +"\n"+"n2:"+ n2.isAlive());

    }
}
