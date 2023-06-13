package operators.instanceOf;
// Understanding the real use of instanceof in java
public class Test1 {

    public static void main(String[] args) {
        Printable p= new A();
        Printable q= new B();
        Call c =new Call();
        c.invoke(q);
        c.invoke(p);
    }
}
