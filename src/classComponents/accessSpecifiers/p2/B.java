package classComponents.accessSpecifiers.p2;
import classComponents.accessSpecifiers.p1.A;
public class B {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
       // System.out.println(a.b); CTE: b is private
        //System.out.println(a.c); CTE: c is protected p1
       // System.out.println(a.d); CTE: d is default p1
    }
}
