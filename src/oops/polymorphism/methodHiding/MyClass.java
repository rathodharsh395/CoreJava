package oops.polymorphism.methodHiding;

public class MyClass {
    public static void main(String[] args) {

        ParentClass p = new ParentClass();
        p.classMethod();// Calling with reference
        p.instanceMethod();//Calling with object

        ChildClass c = new ChildClass();
        c.classMethod();
        c.instanceMethod();

        ParentClass p1 = new ChildClass();
        p1.classMethod();
        p1.instanceMethod();
    }
}
