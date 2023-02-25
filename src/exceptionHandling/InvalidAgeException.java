package exceptionHandling;
// IN Demo20
// Checked exception/ compiletime exception
public class InvalidAgeException extends Exception {
    public InvalidAgeException(){
       super("your are under aged ");
    }
    public InvalidAgeException(String message){
        super(message);
    }
    // Also try by extending RuntimeException to have another scenario
}
