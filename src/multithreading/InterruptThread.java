package multithreading;

public class InterruptThread extends Thread {
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException ie){
             ie.printStackTrace();
        }
    }
    public static void main(String[] args) {
        InterruptThread th = new InterruptThread();
        th.start();
        th.interrupt();
    }

}
