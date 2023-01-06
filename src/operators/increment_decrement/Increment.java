package operators.increment_decrement;

public class Increment {
    public static void main(String[] args) {
        //1. Post-increment Operator
        int a= 5;
        int b= 7;
        int c= a++ + b;
        System.out.println("Post-Increment:"+c);
        //2. Pre-Increment Operator
        int A= 5;
        int B= 7;
        int C= ++A + B;
        System.out.println("Pre-Increment:"+C);
        //Example-
        int M = 1 , N = 2;
        int O = M++ + N + ++M;
        System.out.println("Example:"+ O);
    }
}
