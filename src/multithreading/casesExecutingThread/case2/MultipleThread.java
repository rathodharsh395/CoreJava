package multithreading.casesExecutingThread.case2;

public class MultipleThread implements Runnable{
    String task;
    MultipleThread(String task){
        this.task = task;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(task+":"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.getMessage();
            }
        }
    }
    public static void main(String[] args){
        MultipleThread mt= new MultipleThread("Hello Java");
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        Thread t3 = new Thread(mt);
        t1.start();
        t2.start();
        t3.start();

        int count = Thread.activeCount();
        System.out.println("No of active threads:"+count);
    }
}
