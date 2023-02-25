package exceptionHandling;

public class Demo25PrintStackTrace {
    static{
      // throw new ArithmeticException("divide by zero");
      // java: initializer must be able to complete normally
    }

    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException arithmeticException){
           // arithmeticException.printStackTrace();
           // System.out.println(arithmeticException);
           // System.out.println(arithmeticException.toString());
            System.out.println(arithmeticException.getMessage());
        }
        finally {
            System.out.println("abc");
        }
    }
}
