package oops.polymorphism.methodOverloading;

public class AutomaticPromotion2 {
    void show(StringBuffer a){
        System.out.println("stringbuffer method");
    }
    void show(String a){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        AutomaticPromotion2 a = new AutomaticPromotion2();
        a.show("abc");
        a.show(new StringBuffer("xyz"));
//      a.show(null);

    }
}
