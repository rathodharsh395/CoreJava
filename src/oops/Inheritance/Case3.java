package oops.Inheritance;

public class Case3 {
    public static void main(String[] args) {
        //Child class object and parent class reference
        //with this we can access everything from child class and parent class[non-private, non-static, non-final]
        Parent parentReference = new Child();
        System.out.println(parentReference.a);//10
        System.out.println(parentReference.b);//20
        System.out.println(parentReference.c);//30
        // System.out.println(parentReference.d);
        parentReference.m1();
        parentReference.m2(); // from child
     // parentReference.m3();  CTE

    }
}
