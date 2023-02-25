package oops.polymorphism.methodOverriding;

public class MessageServiceImpl extends MessageService{
   public void sendMessage(String message) {
       System.out.println("child" + message);
   }
    public static void main(String[]args){
        MessageService messageService = new MessageService();
        MessageServiceImpl ref = new MessageServiceImpl();
        MessageService obj = new MessageServiceImpl();
        messageService.sendMessage("abc");
        ref.sendMessage("xyz");
        obj.sendMessage("pqr");
        //based on object reference call to sendMessage method is decided
        //thus it has to wait till execution of class starts and object get created.
    }
    public static void main(String args){
        System.out.println("overridden");
    }
    //the above main method is not overridden
    // because they are static members of class
}
