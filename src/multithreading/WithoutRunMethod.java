package multithreading;
//Not compulsory to override run() method
public class WithoutRunMethod extends Thread{

    public static void main(String[] args) {
        Thread t =new Thread();
        t.start();
    }

}
