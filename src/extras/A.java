package extras;

public class A {
    void  A(){
        System.out.println("method A");
    }
    static void m1(){
        System.out.println("Static from parent");
    }
    void m2(){
        System.out.println("Instance from parent");
    }
    public static void main(String[] args) {
        A a=new A();
        a.A();
        a.m2();
        a.m1();
    }
}

