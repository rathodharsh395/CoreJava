package java8Features.functionalInterface;
@FunctionalInterface
interface Sayable{
    void say(String msg);// abstract method
    // It can contain any number of Object class method
    int hashCode();
    String toString();
    boolean equals(Object obj);
}

public class FunctionalInterface1 implements Sayable{
    @Override
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInterface1 fi = new FunctionalInterface1();
        fi.say("hello");
    }

}
