package exceptionHandling;

public class Demo16ThrowsKeyword {
    public static void main(String[] args) {

            System.out.println("1");
            System.out.println(divide(10, 0));
            System.out.println("2");

         /*catch (ArithmeticException arithmeticException) {
            System.out.println("invalid dr");
        }*/
        System.out.println("rest of main method");
    }
    public static int divide(int num1,int num2){
        System.out.println("3");
        try {
            return num1 / num2;
        }
        catch (ArithmeticException e){
            return 0;
        }
    }
    //using throws keyword we can pass exception to the caller method (main)
    //avoid handling it in called method(divide) as handled above
    //we write throws keyword along with exception class name
    //at method definition
}
