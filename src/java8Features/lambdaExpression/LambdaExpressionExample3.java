package java8Features.lambdaExpression;

interface Addable{
    int add(int a,int b);
}
public class LambdaExpressionExample3 {
    public static void main(String[] args) {

        //Multiple parameter in lambda expression
        Addable ad1 = (a,b)-> a+b ;
        System.out.println(ad1.add(10,20));

        //Cannot omit parenthesis in case of multiple parameters
        Addable ad2 = (int a,int b)-> a-b;
        System.out.println(ad2.add(10,20));

    }
}
