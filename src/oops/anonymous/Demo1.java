package oops.anonymous;

public class Demo1 {
    public static void main(String[] args) {
        // for interface
        MovieService movieService = new MovieServiceImpl();
        movieService.bookTicket();

        MovieService ref = new MovieService() {
            @Override
            public void bookTicket() {
                System.out.println("Movie ticket booked by anonymous class");
            }
        };
        ref.bookTicket();
        // for abstract class
        MusicService musicService = new MusicServiceImpl();
        musicService.bookTickets();

        MusicService refe = new MusicService(){
            public void bookTickets(){
                System.out.println("music tickets with anonymous class");
            }
        } ;
        refe.bookTickets();

    }
}
