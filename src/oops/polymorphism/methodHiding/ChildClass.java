package oops.polymorphism.methodHiding;

public class ChildClass extends ParentClass{
     public static void classMethod(){
        System.out.println("classMethod in Chilc class");
    }
    public void instanceMethod(){
        System.out.println("instaceMethod in Chile class");
    }

}
