package multithreading;

public class NamingThread {
    public static void main(String[] args) {
        System.out.println("HI");
        System.out.println(Thread.currentThread());//Reference: Thread[main,5,main]
        System.out.println(Thread.currentThread().getName());//Name: main
        Thread.currentThread().setName("Harish");//Do not return anything
        System.out.println(10/0);


    }
}
