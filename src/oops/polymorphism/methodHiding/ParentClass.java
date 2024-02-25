package oops.polymorphism.methodHiding;

public class ParentClass {
    /*final*/public static void classMethod(){
        System.out.println("static Method in Parent class");
    }
    public void instanceMethod(){
        System.out.println("instance Method in Parent class");
    }
}
