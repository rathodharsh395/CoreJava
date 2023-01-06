package operators.increment_decrement;

public class Fact1 {
    public static void main(String[] args) {
        //Fact1:++ and -- can be applied to variables only
        int a = 10;
        int b = ++a;
        System.out.println(b);
        //int  c = 11++;
        //System.out.println(c);  CTE(compile time error)
    }
}
