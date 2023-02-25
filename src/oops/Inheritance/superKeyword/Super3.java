package oops.Inheritance.superKeyword;
//Use 3: supper(); can be used to invoke immediate parent class constructor
public class Super3{
    Super3(){
        System.out.println("super class cons");
    }
}
class SuperDemo3 extends Super3{
    SuperDemo3(){
        //super();
        System.out.println("child class cons");
    }
    public static void main(String[] args) {
        SuperDemo3 sp3 = new SuperDemo3();
    }
}
