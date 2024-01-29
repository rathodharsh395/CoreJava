package stringHandling;
import java.util.StringJoiner;
public class StringConcatenation4 {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        String result = joiner.toString();
        System.out.println(result);
    }
}
