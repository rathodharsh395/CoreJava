package java8Features.lambdaExpression;

interface Writable{
    public String write(String name);
}
public class LambdaExpressionExample2{
    public static void main(String[] args){

        //Lambda expression with single parameter
        Writable s1= (name)->{ return "Hello, "+name;};
        System.out.println(s1.write("Sonoo"));

        // you can omit the function parentheses and curly bracket with return
        Writable s2= name -> "Hi, "+name;
        System.out.println(s2.write("Monu"));
    }
}
