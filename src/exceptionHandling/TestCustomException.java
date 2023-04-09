package exceptionHandling;

public class TestCustomException {
    static String displayError(){
        return "invalid  message";
    }
    public static void main(String[] args) {
        Customer cust=new Customer();
        //I can add throws declaration with caller method
        try{
            //cust.getLogin("admin@gmail.com",1234);
        }
        catch (Exception e){
            System.out.println(displayError());
        }

    }

}
