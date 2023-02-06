package Oops.Inheritance;
//Use 2: "super" keyword can be used to invoke immediate parent class method
 public class Super2 {
    void m1(){
        System.out.println("Super class method ");
    }
}
 class SuperDemo2 extends Super2{
     void m1(){
         System.out.println("Child class method");
     }
    void show(){
        m1();
        super.m1();
    }
    public static void main(String[] args) {
      SuperDemo2 sp2 = new SuperDemo2();
      sp2.show();
    }
}