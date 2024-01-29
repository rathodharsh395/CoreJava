package exceptionHandling;

public class Demo23StackOverflowError {
    public static void main(String[] args) {
        main(null);
    }
    /*Exception in thread "main" java.lang.StackOverflowError
      at exceptionHandling.Demo23.main(Demo23.java:5)*/
}
