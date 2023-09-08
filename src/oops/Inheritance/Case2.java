package oops.Inheritance;

public class Case2 {
    public static void main(String[] args) {
        //Child class object and child class reference
        //with this we can access everything from child and parent class [ non-private, non-final]
        Child child = new Child();
        System.out.println(child.a);//10      from  parent
        System.out.println(child.b);//20
        System.out.println(child.c);//300
        System.out.println(child.d);//400

        child.m1(); // from parent
        child.m2();
        child.m3();

    }
}
