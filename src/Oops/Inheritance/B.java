package Oops.Inheritance;

public class B extends A  {
    static {
        System.out.println("static block B");
    }
    {
        System.out.println("instance block B");
    }
    public B(){
        // super();//call to the parent class constructor
        System.out.println("B class const");
    }

    public static void main(String[] args) {
        B re = new B();
        re.m2();
    }
}

