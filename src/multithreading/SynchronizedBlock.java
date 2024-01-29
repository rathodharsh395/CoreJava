package multithreading;

class  TicketBook{
    static int total_seats = 10;
    synchronized void bookSeat(int seats){
        if(total_seats>=seats){
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());

            System.out.println(seats + " Seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats Left "+total_seats);

            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName());
        }
        else {
            System.out.println("Sorry not enough seats left");
            System.out.println("Seats Left :" + total_seats);
        }
    }
}
public class SynchronizedBlock extends Thread{
    static TicketBook b;
    int seat;
    public void run(){
        b.bookSeat(seat);
    }
    public static void main(String[] args) {
        b = new TicketBook();

        SynchronizedBlock t1 = new SynchronizedBlock();
        SynchronizedBlock t2 = new SynchronizedBlock();

        t1.seat = 7;
        t2.seat = 6;
        t1.start();
        t2.start();
    }

}
