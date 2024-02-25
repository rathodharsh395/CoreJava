package oops.polymorphism.methodHiding;

public class ChildClass extends ParentClass{
     public static void classMethod(){
        System.out.println("static Method in Chilc class");
    }
    public void instanceMethod(){
        System.out.println("instance Method in Chile class");
    }

}
