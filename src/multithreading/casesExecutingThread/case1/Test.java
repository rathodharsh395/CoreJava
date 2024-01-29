package multithreading.casesExecutingThread.case1;
//1. Performing Single task from Single thread
 public class Test extends Thread{
     public void run(){
         System.out.println("task 1");
     }
    public static void main(String[] args) {
        Test thread1 = new Test();// creating an object of the class
        thread1.start(); // start the thread
    }
}
