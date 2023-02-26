package exceptionHandling;

public class Demo8 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException nullPointerException){
            System.out.println("NO operations are allowed on null");
        }
        finally{
            System.out.println("closing the database connections");
        }
        System.out.println("rest of the main method");


    }
}