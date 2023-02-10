package Oops.polymorphism.methodOverriding;

public class AB {
     int a=10;
    static void m1(){
        System.out.println("AB-m1");
    }
    static  void m3(){
         System.out.println("AB-m3");
     }
      void m2(){
         System.out.println("AB-m2");
     }
}
class ABC extends AB{
      static int a= 20;
     /*protected void m1(){
        System.out.println("ABC-m1");
    }
public static void m2(){
    System.out.println("ABC-m2");
}*/
 static void m3(){
    System.out.println("ABC-m3");
}
    public static void main(String[] args) {
        AB.m1();
        AB.m3();
        AB obj1 = new AB();
        obj1.m2();
        //obj1.m1();
       // obj1.m3();

        ABC obj2 = new ABC();
        obj2.m1();
        obj2.m2();
        obj2.m3();
        AB obj3=new ABC();
       // obj3.m3();
        int a1 = obj3.a;
       // System.out.println(a1);
    }
}
