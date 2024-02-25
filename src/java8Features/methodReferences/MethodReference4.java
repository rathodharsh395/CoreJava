package java8Features.methodReferences;

interface Messageable{
    Message getMessage(String msg);
}
class Message {
    Message(String msg){
        System.out.println(msg);
    }
}
public class MethodReference4 {
    public static void main(String []args){

        System.out.println("using lambda");
        Messageable hello = (s)-> new Message(s);
        hello.getMessage("Hello");

        System.out.println("using message reference");
        Messageable hi = Message::new;
        hello.getMessage("HI");
    }
}
