package multithreading;

public class SleepThread extends Thread{
        public void run(){
            for(int i=1;i<=3;i++){
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread()+":"+i);
            }
        }
        public static void main(String[] args){
            SleepThread a1 = new SleepThread();
            a1.setName("First Thread");
            SleepThread a2 = new SleepThread();
            a2.setName("Second Thread");
            a1.start();
            a2.start();
        }
}

