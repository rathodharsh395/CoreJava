package oops.abstraction;

public interface I1 {
//    default abstract void show();   CTE  Java 8
//    private abstract void show();   CTE  Java 8
      default void show(){}
//    private void display();         CTE  Java 8
//    private void dispaly(){}        CTE  Java 8
//    private static display(){}      CTE  Java 8
      static void display(){}

      void method();

      public static final int a=10;
}
interface I2{
      void method();
}
class Ii1 implements I1,I2{
      public void method(){
            System.out.println("1");
      }

      public static void main(String[] args) {
//            I1 a = new I1();
            Ii1 i = new Ii1();
                  i.method();

      }
}
