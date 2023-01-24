package classComponents.Blocks;
//order of execution: static block > instance block > constructor
public class StaticBlock1 {
    String b ;
    public StaticBlock1(String B)
    {
        b = B;
    }
    {
        System.out.println(a+" "+b);  //instance block access both static and instance variable
    }
    //int b = 20;  CTE: illegal forward reference
    static int a =10;
     void instance(){
        System.out.println("instance Method");
    }
    static void Static(){
        System.out.println("static method");
    }
    static {
        System.out.println("HR");
    }
    public static void main(String[] args) {
        System.out.println("main");
        StaticBlock1.Static();
        StaticBlock1 re = new StaticBlock1("B");
        re.instance();
        System.out.println(re.b);

    }
    static {
        System.out.println(a);// static block  accesses only static variable
       //System.out.println(b); CTE:non-static variable b cannot be referenced from static context
    }
}
