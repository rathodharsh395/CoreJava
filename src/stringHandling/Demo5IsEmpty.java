package stringHandling;

public class Demo5IsEmpty {
    public static void main(String[] args) {
        String str = "";
        char[] chars = str.toCharArray();
        System.out.println(chars.length==0?"Is Empty":"not Empty");

        String str2 = " ";
        boolean isEmpty = str2.isEmpty();
        System.out.println(isEmpty);

        String s = null;
        System.out.println(s.isEmpty());
    }
}
