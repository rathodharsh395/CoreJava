package NestedClasses;

interface Showable{
    void show();
    interface Message{
        void msg();
    }
}
public class NestedInterface1 implements Showable.Message{
    @Override
    public void msg(){
        System.out.println("Hello nested interface");
    }
    public static void main(String[] args) {
        Showable.Message message = new NestedInterface1();
        message.msg();
    }
}
