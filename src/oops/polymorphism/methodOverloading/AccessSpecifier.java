package oops.polymorphism.methodOverloading;

public class AccessSpecifier {
    private void m1(){
        System.out.println("m1 without param");
    }
    private void m1(String str){
        System.out.println("m1 with param"+str);
    }
    static void m2(){
        System.out.println("m2 without param");
    }
    static void m2(String str){
        System.out.println("m2 with param"+str);
    }
    final void m3(){
        System.out.println("m3 without param");
    }
    final void m3(String str){
        System.out.println("m3 with param"+str);
    }
    synchronized void m4(){
        System.out.println("m4 without param");
    }
    synchronized void m4(String str){
        System.out.println("m4 with param"+str);
    }
    strictfp void m5(){
        System.out.println("m5 without param");
    }
    strictfp void m5(String str){
        System.out.println("m5 with param"+str);
    }
    public static void main(String[] args) {
    AccessSpecifier ac = new AccessSpecifier();
    ac.m1();
    ac.m1("abc");
    ac.m2();
    ac.m2("xyz");
    ac.m3();
    ac.m3("pqr");
    ac.m4();
    ac.m4("mno");
    ac.m5();
    ac.m5("java");
    }
}
