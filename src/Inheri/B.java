package Inheri;

public class B extends A{
    static void m1(){
        System.out.println("Static from child");
    }
    void m2(){
        System.out.println("Instance from child");
    }
    public static void main(String[] args) {
        A a=new B();
        a.m2();
        B.m1();
        System.out.println("*************");
        a.m1();
        A.m1();
        System.out.println("***************");
        B.m1();

    }
}
