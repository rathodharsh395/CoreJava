package NestedClasses;

public class LocalInnerClass1 {
    public static void main(String[] args) {
        //Local Inner class can't have static members as its members
        //we can't access this class outside of method
        //we define the class inside the method, use that inside the method
        class Local{
            int instanceVariable= 100;
            void instanceMethod(){System.out.println("LIC instance Method");}
            {System.out.println("LIC instance block");}
            Local(){System.out.println("LIC Constructor");}
            class InnerClass{}
            //static int staticVariable =200;//CTE
            //static void staticMethod(){System.out.println("LIC static method");}//CTE
            //static {System.out.println("LIC static block");}CTE
            // static class SNC{}//CTE
        }
        Local local= new Local();
        System.out.println("Instnace varible "+ local.instanceVariable);
        local.instanceMethod();
    }
    void getLocal(){
       // Local l = new Local();// CTE
       // local.instanceMethod();//CTE
        //System.out.println("Instance variable"+local.instanceVariable);//CTE
    }
}
