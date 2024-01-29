package multithreading;

class  TotalEarnings extends Thread{
    int total_earning ;
    public void run(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total_earning = total_earning + 100;
            }
            this.notify();
        }
    }
}
public class MovieBookApp {
    public static void main(String[] args) {
        TotalEarnings te = new TotalEarnings();
        te.start();
        synchronized (te){
            try {
                te.wait(100);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total earnings :"+te.total_earning +" Rs");
        }
    }
}
