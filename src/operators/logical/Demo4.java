package operators.logical;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println((3>4) && (5>4) && (5>(10/0)));//advantage of && over &
        // System.out.println((3>4) & (5>4) & (5>(10/0)));//ArithmeticException

        System.out.println((3<4) || (5>4) || (5>(10/0)));//advantage of || over |
        //System.out.println((3<4) | (5>4) | (5>(10/0)));//ArithmeticException

    }
}
