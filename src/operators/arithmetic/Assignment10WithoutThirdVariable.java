package operators.arithmetic;

public class Assignment10WithoutThirdVariable {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        System.out.println("number1="+number1);
        System.out.println("number2="+number2);

        //without third temp variable
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("After Swaping");
        System.out.println("number1="+number1);
        System.out.println("number2="+number2);

    }
}
