package oops.Inheritance;

public class A {
    static {
        System.out.println("static block A");
    }
    {
        System.out.println("instance block of A");
    }
    public A(){
        System.out.println("A class const");
    }
     void m1 (){
         System.out.println("Class A m1 method called");
    }
}
