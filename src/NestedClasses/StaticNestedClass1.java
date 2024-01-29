package NestedClasses;

 class StaticNestedClass1 {
    static class StaticNestedClass2 {
        // static nested class can have both static and non-static as its members
        int instanceVariable = 10;
        void instanceMethod() {
            System.out.println("staticNestedClass instance Method");
        }

        {System.out.println("StaticNestedClass instance Block");}
        StaticNestedClass2() {System.out.println("StaticNestedClass constructor");}
        static int staticVariable = 200;
        static void setStaticMethod() {
            System.out.println("StaticNestedClass static method");
        }
        static {System.out.println("StaticNestedClass static block");}

        static class StaticNestedClass3{}

    }
    public static void main(String[] args) {
        // Same Class
        //calling static members of StaticNestedClass
        System.out.println("StaticNestedClass " + StaticNestedClass2.staticVariable);
        StaticNestedClass2.setStaticMethod();
        //Calling instance members of StaticNestedClass
        StaticNestedClass1.StaticNestedClass2 ref = new StaticNestedClass2();
        System.out.println("StaticNestedClass instance variable:" + ref.instanceVariable);
        ref.instanceMethod();
    }
}
class SNC{
    public static void main(String[] args) {
        //Different Class
        //calling static members of StaticNestedClass
        System.out.println("StaticNestedClass " + StaticNestedClass1.StaticNestedClass2.staticVariable);
        StaticNestedClass1.StaticNestedClass2.setStaticMethod();
        //Calling instance members of StaticNestedClass
        StaticNestedClass1.StaticNestedClass2 ref = new StaticNestedClass1.StaticNestedClass2();
        System.out.println("StaticNestedClass instance variable:" + ref.instanceVariable);
        ref.instanceMethod();
    }
}



