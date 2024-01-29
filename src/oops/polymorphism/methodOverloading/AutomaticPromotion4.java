package oops.polymorphism.methodOverloading;

public class AutomaticPromotion4 {
    void show(int a){
        System.out.println("int method");
    }
    void show(int...a){
        System.out.println("varargs method");
    }

    public static void main(String[] args) {
        AutomaticPromotion4 a = new AutomaticPromotion4();
        a.show();
    }
}
