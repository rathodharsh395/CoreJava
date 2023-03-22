package extras;

public class StaticInstance {
    static int i=20;
   public static void m1(){
       System.out.println(i);
   }
   static {
       System.out.println("abc");
   }
    {
        System.out.println("xyz");
    }
   //content of static method will not be executed unless we
    // call the method

    public static void main(String[] args) {
        StaticInstance.m1();
        try {
            StaticInstance ref = new StaticInstance();
        }
        catch (Exception e){
            System.out.println();
        }
    }
}

