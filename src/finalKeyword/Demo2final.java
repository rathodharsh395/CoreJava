package finalKeyword;
// Reference of final Variable
public class Demo2final {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("H");
        System.out.println(sb.toString());

        // changing internal state of object reference
        sb.append("R");
        System.out.println(sb);
    }
}
