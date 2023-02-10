package Inheri;

public class A {
    static void m1(){
        System.out.println("Static from parent");
    }
    void m2(){
        System.out.println("Instance from parent");
    }

    public static void main(String[] args) {
        A a=new A();
        a.m2();
        a.m1();
    }
}
