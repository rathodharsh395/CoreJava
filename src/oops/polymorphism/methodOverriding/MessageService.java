package oops.polymorphism.methodOverriding;

public class MessageService {
   void sendMessage(String message){
       System.out.println("parent"+message);
   }
   public static void main(String[] args){
       System.out.println("this main method is called by JVM");
       main("");
   }
   public static void main(String args){
       System.out.println("overloaded");
   }
}
