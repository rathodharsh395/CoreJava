package multithreading;

public class JoinThread implements Runnable{
        public void run(){
            System.out.println("Child thread running");
            for(int i=1;i<=5;i++){
                System.out.println("I "+i);
                try{
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
        public static void main(String[] args){
            JoinThread x = new JoinThread();
            Thread t = new Thread(x);
            t.start();
            try{
                t.join(2000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
            System.out.println("Main Thread ending");
        }
}
