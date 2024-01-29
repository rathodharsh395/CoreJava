package multithreading.casesExecutingThread.case4;

public class MyThread extends Thread{
    String task;
    MyThread(String task){
        this.task = task;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(task+":"+i);
            try{
                Thread.sleep(1000); }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage()); }
        } }
    public static void main(String[] args){
        MyThread th1 = new MyThread("Cut the ticket");
        MyThread th2 = new MyThread("Show your seat");
        th1.start();
        th2.start();
    } }
