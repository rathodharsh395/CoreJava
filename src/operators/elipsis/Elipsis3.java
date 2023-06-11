package operators.elipsis;

public class Elipsis3 {
    public static void main(String[] args) {
        sum(10);

    }
    public static void sum(int ... x)
    {
        System.out.println("Var-arg method"+x[0]);
    }
    public static void sum(int x)
    {
        System.out.println("normal method"+x);
    }
}
