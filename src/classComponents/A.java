package classComponents;

public class A {
   /* public static void main(String[] args) {
 A re = new A();
 re.instanceMethod();
    }*/
    int a = 10;
    static int b =20;
    void m1(){}
    void instanceMethod(){
        //IV
        System.out.println("instance variable"+a);
        //IM
        m1();//instance method call
        //SV
        System.out.println("static variable"+b);
        //SM
        m2();//static method call
    }
    static void m2(){}
    static void staticMethod(){
      // m1();//CTE
      //System.out.println(a);
        A ref = new A();
        //IV
        System.out.println("instance variable"+ref.a);
        //IM
        ref.instanceMethod();//instance method call
        //SV
        System.out.println("static variable"+b);
        //SM
        m2();//static method call
    }
}
