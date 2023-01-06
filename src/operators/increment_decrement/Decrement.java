package operators.increment_decrement;
public  class Decrement{
    public static void main(String[] args) {
        //1. Post-Decrement Operator
        int a = 5;
        int b = 7;
        int c = a-- + b;
        System.out.println("Post-Decrement:"+c);
        //2. Pre-Decrement Operator
        int A = 5;
        int B = 7;
        int C = --A + B;
        System.out.println("Pre-Decrement: "+C);
        //Example-
        int m = 3, n = 2;
        int o = m-- + n + --m;
        System.out.println("Example: "+o);

    }
}