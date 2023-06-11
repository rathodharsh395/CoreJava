package operators.conditional;

public class AsSwitchCase {
    public static void main(String[] args) {
       String day="Sunday";
        System.out.println(
                (day=="Monday")?1:(day=="Tuesday")?2:(day=="Wednesday")?3:0
        );
    }
}
