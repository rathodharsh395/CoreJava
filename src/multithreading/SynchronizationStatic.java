package multithreading;

 class BookThreaterApp{
     static int total_seats = 20;
     static synchronized  void bookSeat(int seats){
         if(total_seats>= seats){
             System.out.println(seats +":Seats booked successfully");
             total_seats = total_seats-seats;
             System.out.println("seats left: "+total_seats);
         }
         else {
             System.out.println("Cannot book "+seats+" booked");
             System.out.println("Only "+total_seats+" seats left");
         }
     }
 }
 class MyThread1 extends Thread{
     BookThreaterApp b1;
     int seates;
     MyThread1(BookThreaterApp b1,int seats){
         this.b1 = b1;
         this.seates = seats;
     }
     public void run(){
         b1.bookSeat(seates);
     }
 }
 class MyThread2 extends Thread{
     BookThreaterApp b2;
     int seates;
     MyThread2(BookThreaterApp b2,int seats){
         this.b2 = b2;
         this.seates = seats;
     }
     public void run(){
         b2.bookSeat(seates);
     }
 }
public class SynchronizationStatic {
    public static void main(String[] args) {
        BookThreaterApp b1 = new BookThreaterApp();
        MyThread1 t1 = new MyThread1(b1,7);
        t1.start();
        MyThread2 t2 = new MyThread2(b1,6);
        t2.start();
        //-------------
        BookThreaterApp b2 = new BookThreaterApp();
        MyThread1 t3 = new MyThread1(b2,10);
        t3.start();
        MyThread2 t4 = new MyThread2(b2,5);
        t4.start();

    }
}
