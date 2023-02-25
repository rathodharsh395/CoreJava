package multithreading.casesExecutingThread.case2;
//2. Performing Single task from multiple thread
public class Test extends Thread{
    public void run(){
        System.out.println("task 1");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.start();
        t2.start();
        t3.start();
    }
}

