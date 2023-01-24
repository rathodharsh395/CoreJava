package classComponents.This;

public class ThisDemo3 {
    public ThisDemo3(){
        // from a given constructor we can call maximum of only one constructor of the same class
       this(10);
       //this(10,"HR");  CTE java: call to this must be first statement in constructor
        System.out.println("zero parameterized ");
    }
    public ThisDemo3(int a){
      this(20,"HR");
        System.out.println("parameterized");
    }
    public ThisDemo3(int a,String b){
        System.out.println("constructor chaining");
    }
    public static void main(String[] args) {
        ThisDemo3 re = new ThisDemo3();
    }
 }
