package oops.Inheritance;

public class Case1 {
    public static void main(String[] args) {
        //parent class object and parent class reference:
        //we can access variable and methods only from parent class
        Parent parent = new Parent();
        System.out.println(parent.a);//10
        System.out.println(parent.b);//20
        System.out.println(parent.c);//30
   //   System.out.println(parent.d);  CTE
        parent.m1();
        parent.m2();
   //   parent.m3();  CTE
    }
}
