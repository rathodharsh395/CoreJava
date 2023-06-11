package operators.conditional;

public class Demo3 {
    public static void main(String[] args) {
        int x= 2;
        int y= 4;
        System.out.println(x++/2 == y--%3 ? x : y);
    }
}
