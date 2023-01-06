package classComponents;

public class addTest {
    int age = 20;
    //System.out.println();
    public static void main(String[] args) {
        addTest refe = new addTest();
        System.out.println(refe.age);

        addTest ref = new addTest();
        System.out.println("addition"+ref.add(10,20));
       // System.out.println("addition"+add(20,30));//CTE
        System.out.println("Multiplication"+multiply(10,20));
        System.out.println("multiplication"+addTest.multiply(20,20));
    }
     void display(){
         System.out.println(add(10,10));
     }
     private int add(int number1,int number2){
        // System.out.println(age);
        return number1+number2;
    }
    private static int multiply(int number1,int number2){
        //System.out.println(refe.age);
        return number1*number2;
    }
}
