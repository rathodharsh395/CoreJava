package stringHandling;

import java.util.Arrays;

public class Demo25TypeConversion {
    public static void main(String[] args) {

        int a = 10;
        String s = String.valueOf(a);
        System.out.println(s);

        String str = "Deepak";
        char[] ch = str.toCharArray();
        System.out.println(str.length());
        System.out.println(ch.length);
    }
}
