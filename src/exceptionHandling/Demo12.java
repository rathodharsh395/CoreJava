package exceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        System.out.println("value:"+getValue());//3
    }
    public static int getValue(){
        try{
            return 1;
            //System.out.println("abc");//CTE :unreachable statement
        }
        catch(Exception e){
            return 2;
            //System.out.println("abc");//CTE :unreachable statement
        }
        finally{
            return 3;
            //System.out.println("abc");//CTE :unreachable statement
        }
    }
}
