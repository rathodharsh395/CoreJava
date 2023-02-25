package oops.Inheritance.superKeyword;
//Use 1:"super" keyword refers to the immediate parent class instance variable
public class Super1 {
    int i = 10;
}
class SuperDemo1 extends Super1{
    int i = 20;
    void show(int i){
        System.out.println(i);//30
        System.out.println(this.i);//20
        System.out.println(super.i);//10

    }
}