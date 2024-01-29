package stringHandling;

public class StringConcatenation1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(20);
        sb.append(2023);
        sb.append(new char[]{'a','b','c'});
        sb.append(false);

        String result= sb.toString();
        System.out.println(result);
    }
}
