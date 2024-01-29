package stringHandling;

public class Demo23Trim {
    public static void main(String[] args) {
        String str= new String("    Scientech Easy    ");

        System.out.println("Original string:"+str);
        String trimElement = str.trim();

        System.out.println("After removing space, String:"+trimElement);
    }
}
