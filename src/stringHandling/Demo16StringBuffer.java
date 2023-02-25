package stringHandling;

public class Demo16StringBuffer {
    public static void main(String[] args) {
     //StringBuffer stringBuffer = "abc";// CTE: incompatible types
        StringBuffer stringBuffer = new StringBuffer("string");
        stringBuffer.append(" handling");
        System.out.println(stringBuffer);
       stringBuffer.insert(1,"welcome to");
       System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(1);
        System.out.println(stringBuffer);

        stringBuffer.insert(1,'w');
        System.out.println(stringBuffer);
        stringBuffer.insert(11,"s");
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
