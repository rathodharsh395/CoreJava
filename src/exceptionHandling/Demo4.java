package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            String str = "null";
            System.out.println(str.length());
        }
        catch(NullPointerException a){
            System.out.println("NO operation are allowed on null "+a);
        }
        System.out.println("rest of the main method");

    }
}
