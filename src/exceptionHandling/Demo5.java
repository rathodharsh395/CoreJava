package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try{
            String str= null;
            System.out.println(str.length());
        }
        catch (ArithmeticException e){
            System.out.println("NO operations are allowed on null ");
        }
        System.out.println("rest of the main method");
    }
}
