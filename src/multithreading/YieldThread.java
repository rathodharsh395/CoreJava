package multithreading;

public class YieldThread extends Thread{
        public void run(){
            System.out.println(Thread.currentThread());
            Thread.yield();
            System.out.println(Thread.currentThread());
        }
        public static void main(String[] args){
            YieldThread a1 = new YieldThread();
            Thread t1 = new Thread(a1,"First Thread");
            YieldThread a2 = new YieldThread();
            Thread t2 = new Thread(a2,"Second Thread");
            t1.setPriority(4);
            t2.setPriority(8);
            t1.start();
            t2.start();
        }
}
