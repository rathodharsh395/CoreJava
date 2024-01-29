package stringHandling;
// 1. Append
// 2. Reading and Changing Characters
public class Demo16StringBuffer {
    public static void main(String[] args) {
        //StringBuffer stringBuffer = "abc";// CTE: incompatible types
        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append("Hello");
        sb1.append(1234);
        System.out.println(sb1);
        sb1.appendCodePoint(66); //B
        System.out.println(sb1);

        // Reading and Changing
        StringBuffer sb = new StringBuffer("Live with");
        System.out.println("charAt(1) :" + sb.charAt(1));
        sb.setCharAt(1, 'o');
        System.out.println("charAt(1) :" + sb.charAt(1));

        StringBuffer sb2 = new StringBuffer("I love Java Programmint");
        System.out.println("Character at index 7: " + sb2.charAt(7));
        System.out.println("Unicode code point at index 7: " + sb2.codePointAt(7));
        System.out.println("Unicode code point before index 7: " + sb2.codePointBefore(7));
        System.out.println("Code points between indices 2 and 7: " + sb2.codePointCount(2, 7));

        StringBuffer sb3 = new StringBuffer("Java Programming");
        char[] c = new char[9];
        sb3.getChars(0, 8, c, 0);
        System.out.println("Contents of character array:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }
    }
}
