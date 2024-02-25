package java8Features;

interface Telling{
    // default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void sayMore(String msg);
    // static method
    static void sayLouder(String msg){
        System.out.println(msg);
    }
}
public class defaultAndStaticMethod implements Telling{
    public void sayMore(String msg){     // implementing abstract method
        System.out.println(msg);
    }
    public static void main(String[] args) {
        defaultAndStaticMethod dm = new defaultAndStaticMethod();
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        Telling.sayLouder("Helloooo...");   // calling static method
    }
}