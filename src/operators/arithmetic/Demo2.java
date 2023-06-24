package operators.arithmetic;

public class Demo2 {
    public static void main(String[] args) {
        //ArithmeticException: / by zero
        // System.out.println('A'/0);
        // System.out.println('A'%0);

        System.out.println(1/10);//0
        System.out.println(1%10);//1
        System.out.println(10/1);//10
        System.out.println(10%1);//0
        int a = 5;
        int b = 10;
        double c = 5;
        double d = 10;
        System.out.println(a/b);//0
        System.out.println(a%b);//5
        System.out.println(c/d);//0.5
        System.out.println(c%d);//5.0
    }
}
