package operators.increment_decrement;

public class Demo3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a++ + ++b + c-- + d--);//11
        System.out.println(a+b+c+d);//10

    }
}
