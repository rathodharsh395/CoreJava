package oops.anonymous;

public class Demo3 {
    public static void main(String[] args) {
        MovieService movieservice = new MovieService() {
            @Override
            public void bookTicket() {
                System.out.println("Movie tickets");
            }
        };
        movieservice.bookTicket();
    }
}
