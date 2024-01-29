package NestedClasses;
//Inner class
public class NonStaticNestedClass1 {
    //we need object of outer class to create object of inner class
    class InnerClass{
        //non-static nested class can't have static members
        int instanceVariable = 100;
        void instanceMethod(){System.out.println("InnerClass instance Method");}
        {System.out.println("InnerClass instance block");}
        InnerClass(){System.out.println("InnerClass constructor");}
        //static int staticVariable =200;//CTE
        //static void staticMethod(){System.out.println("InnerClass static method");}//CTE
        //static {System.out.println("InnerClass static block");}//CTE
        //static class SNC{}//CTE
        class InnerClass2{}
    }
    public static void main(String[] args) {
        NonStaticNestedClass1 nsnc = new NonStaticNestedClass1();
        InnerClass inner = nsnc.new InnerClass();
        System.out.println(inner.instanceVariable);
        inner.instanceMethod();
    }
}
class NSNC{
    public static void main(String[] args) {
        NonStaticNestedClass1 nsnc = new NonStaticNestedClass1();
        NonStaticNestedClass1.InnerClass inner = nsnc.new InnerClass();
        System.out.println(inner.instanceVariable);
        inner.instanceMethod();
    }
}