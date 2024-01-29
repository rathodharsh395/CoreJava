package exceptionHandling;

public class Demo15 {
    public static void main(String[] args) {
        try{
            //System.out.println(10/0);
            throw new ArithmeticException("tring to divide by zero");
        }
        catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }
    }
}
