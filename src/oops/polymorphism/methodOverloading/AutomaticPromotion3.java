package oops.polymorphism.methodOverloading;

public class AutomaticPromotion3 {
    void show(int a, float b){
        System.out.println("int float method");
    }
    void show(float a,int b){
        System.out.println("float int method");
    }

    public static void main(String[] args) {
        AutomaticPromotion3 a = new AutomaticPromotion3();
        a.show(10,20.5f);
        a.show(20.5f,10);
//        a.show(10,20);  CTE
    }
}
