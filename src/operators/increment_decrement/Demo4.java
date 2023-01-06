package operators.increment_decrement;

public class Demo4 {
    public static void main(String[] args) {
        int a= 1;
        int b= 2;
        int c= 3;
        int d= 4;

        System.out.println(a++ + ++b + c-- + d-- + ++a + b-- + --c + ++d);
                //          1     3     3     4     3    3      1     4  = 22
    }
}
