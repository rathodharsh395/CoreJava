package multithreading;
public class NamingThread extends Thread{
//    public void run(){
//        System.out.println("run Method: "+Thread.currentThread().getName());
//    }
    public static void main(String[] args) {

        Thread obj = Thread.currentThread();
        System.out.println("Current thread is: "+obj);//Reference: Thread[main,5,main]
        System.out.println("Name of current thread: "+obj.getName());//Name: main
        obj.setName("MyThread");//Do not return anything
        System.out.println("New Thread Name: "+obj.getName());

        NamingThread n1= new NamingThread();//Name By default: Thread-0
        NamingThread n2= new NamingThread();//Name By default: Thread-1
        n1.start();
        n2.start();

        System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().isAlive());
        System.out.println("n1:"+n1.isAlive() +"\n"+"n2:"+ n2.isAlive());
    }
}
