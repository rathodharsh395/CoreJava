package oops.polymorphism.methodOverloading;
import oops.Encapsulation.Employee;
public class Question {
    public static void main(String[]args){
    m1( null);
    }
    /*static void m1(String str) {
        System.out.println("string" + str);
    }*/
    static void m1(Employee emp){
        System.out.println("Employee"+emp);
    }
    static void m1(Object obj){
        System.out.println("object"+obj);
    }
}
