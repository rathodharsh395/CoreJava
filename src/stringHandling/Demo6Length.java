package stringHandling;

public class Demo6Length {
    public static void main(String[] args) {
        String str = "";
//      System.out.println(str.length);
        System.out.println(str.length());
        String str2 = "I like Scientech Easy";
        System.out.println(str2.length());
        char arr[] = {'S','c','i','e','n','t','e','c','h'};
        String str3 = new String(arr);
        System.out.println(str3.length());

//        String s = null;
//        System.out.println(s.length());
    }
}
