package exceptionHandling;

public class Demo19 {
    public static void main(String[] args) {
        try {
            Class.forName("exceptionHandling.Demo18");
        }
        catch (ClassNotFoundException c){
            System.out.println(c);
            //checked exception/ runtime exception
        }

    }
}
