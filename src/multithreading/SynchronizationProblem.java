package multithreading;
class BookTickets{
    static int total_seats = 10;
    synchronized void bookSeat(int seats){
        if(total_seats>=seats){
            System.out.println(seats + " Seats booked successfully");
            try
            {
                Thread.sleep(400);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
            total_seats = total_seats - seats;
            System.out.println("Seats Left "+total_seats);
        }
        else {
            System.out.println("Sorry not enough seats left");
            System.out.println("Seats Left :" + total_seats);
        }
    }
}
public class SynchronizationProblem extends Thread {
    static  BookTickets b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }
    public static void main(String[] args) {
        b = new BookTickets();
        SynchronizationProblem t1 = new SynchronizationProblem();
        t1.seats=7;
        t1.start();;

        SynchronizationProblem t2 = new SynchronizationProblem();
        t2.seats=6;
        t2.start();
    }

}
