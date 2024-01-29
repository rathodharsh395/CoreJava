package oops.polymorphism.methodOverloading;

public class AutomaticPromotion1 {

    void show(Object a){
        System.out.println("object method");
    }
//    void show(int a){
//        System.out.println("int method");;
//    }
    void show(String a){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        AutomaticPromotion1 a = new AutomaticPromotion1();
        a.show('a');
        a.show("abc");
    }
}
