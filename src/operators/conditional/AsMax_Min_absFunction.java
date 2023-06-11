package operators.conditional;

public class AsMax_Min_absFunction {
    public static void main(String[] args) {
        int num1=10, num2=20;
        //As max function
        System.out.println(Math.max(num1,num2));
        System.out.println(num1>num2?num1:num2);
        //As min function
        System.out.println(Math.min(num1,num2));
        System.out.println(num1<num2?num1:num2);

        //As abs function
        double num= -3.0;
        System.out.println(Math.abs(num));
        System.out.println(num<0?-num:num);
    }
}
