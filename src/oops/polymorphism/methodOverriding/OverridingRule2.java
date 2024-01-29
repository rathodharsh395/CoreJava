package oops.polymorphism.methodOverriding;

interface I1{
    void display1();
}
public abstract class OverridingRule2 {
    abstract void display();

}
class Rule2 extends OverridingRule2 implements I1{
    void display(){

    };
    public void display1(){

    };
    public static void main(String[] args) {

    }
}