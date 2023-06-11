package exceptionHandling;

public class Demo29 {
    public static int m1() {
        try{
            return 1;
        }
        catch (ArithmeticException e){
            return 2;
        }
        finally
        {
            return 3;
        }
    }
    public static void main(String[] args)
    {
        System.out.println( m1());
    }
}
