package oops.polymorphism.methodOverriding;

public class OverridingRule1 {
    void show() throws RuntimeException
    {
        System.out.println("parent method");
    }
}
class Rule extends OverridingRule1{

//    void show() throws Exception{
//        System.out.println("child method");
//    }

    public static void main(String[] args) {

        OverridingRule1 r= new OverridingRule1();
        r.show();

        Rule ru = new Rule();
        ru.show();
    }
}
