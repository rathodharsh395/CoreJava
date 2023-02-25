package exceptionHandling;

public class Demo26NumberFormatException {
    public static void main(String[] args) {
        String str = "1235a";//NumberFormatException
        int i = Integer.valueOf(str);
        System.out.println(i);
    }
}
