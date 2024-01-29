package multithreading;

public class IsInterrupted_Interrupted extends Thread{
    @Override
    public void run() {
//        System.out.println(Thread.interrupted());   //true -> false
          System.out.println(Thread.currentThread().isInterrupted()); //true -> true
        try{
            for(int i=0;i<=5;i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        IsInterrupted_Interrupted i = new IsInterrupted_Interrupted();
        i.start();
        i.interrupt();
    }
}
