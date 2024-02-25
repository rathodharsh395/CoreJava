package java8Features.lambdaExpression;

interface NoReturn{
    void MyMethod();
}
public class LambdaExpressionExample4 {
    public static void main(String[] args) {

        NoReturn n1 = () -> {System.out.println("statement1");System.out.println("statement2");};
        n1.MyMethod();
        // curly braces used when writing return statement or grouping more than one statement
        NoReturn n2 =() -> System.out.println("statement3");System.out.println("statement4");
        n2.MyMethod();
    }
}
