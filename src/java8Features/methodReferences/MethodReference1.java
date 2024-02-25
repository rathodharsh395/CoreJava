package java8Features.methodReferences;
class TakstForThread{
    public static void ThreadTask(){
        System.out.println("Task assigned");
    }
}
public class MethodReference1 {
    public static void main(String []args){
        // using lambda
        Thread t1 = new Thread(()->TakstForThread.ThreadTask());
        t1.start();
        // using method references
        Thread t2= new Thread(TakstForThread::ThreadTask);
        t2.start();
    }
}
