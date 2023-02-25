package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);

        }
        //order of catch block should be from child to parent
        catch(Exception exception){
             System.out.println("dr is zero");
         }
        /*catch(ArithmeticException e){
            System.out.println();
        }*/
        //CTE: java: exception java.lang.ArithmeticException has already been caught

    }
}
