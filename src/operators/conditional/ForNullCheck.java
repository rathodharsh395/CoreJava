package operators.conditional;

public class ForNullCheck {
    public static void main(String[] args) {
        Object obj = null;
      // obj.toString(); NullPointerException

        String value= obj!=null ? obj.toString() : null;
        System.out.println(value);
    }
}
