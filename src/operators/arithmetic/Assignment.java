package operators.arithmetic;

public class Assignment {
    public static void main(String[] args) {
        //Assgnment 14
        int number1 = 5696;
        int number2 = number1%10;        //6
        number1 = number1/10;            //569
        number2+=2;
        int number3= number1%10;         //9
        number1 = number1/10;            //56
        number3+=2;
        int number4= number1%10;         //6
        number1 = number1/10;            //5
        number4+=2;
        int number5= number1%10;         //5
        number1 = number1/10;            //0
        number5+=2;

        System.out.print(number5);
        System.out.print(number4);
        System.out.print(number3);
        System.out.print(number2);

    }
}
