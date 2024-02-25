package java8Features.lambdaExpression;

interface Sayable{
    public String say();
}
public class LambdaExpressionExample1{
    public static void main(String[] args){

        //Lambda expression with no parameter
        Sayable s = ()->{ return "I have nothing to say";};
        System.out.println(s.say());
    }
}
