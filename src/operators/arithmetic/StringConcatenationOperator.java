package operators.arithmetic;

public class StringConcatenationOperator {
    public static void main(String[] args) {
        System.out.println(10+ 20);//30: mathematical addition
        System.out.println(10 + "20");//1020: string concatenation
        System.out.println(10 + 20 + "A" + 30 + 40);//30A3040
        System.out.println('A'+ 'A' + 30 + 40);//200
        System.out.println('A' +"A" + 30 + 40 );//AA3040
        System.out.println('A' +"A");//AA
        System.out.println('A'+ 'A');//130
        //System.out.println('A'/0);ArithmeticException divide by zero
       // System.out.println('A'%0);ArithmeticException divide by zero
        System.out.println('a'+ 1);//97+1= 98;
        System.out.println('a'%'A');//97%65= 32;
        System.out.println('a'/'A');// 97/65=1
        //System.out.println("a"/'A');CTE bad operand types for binary operator '/'
       // System.out.println('a'/"A");CTE bad operand types for binary operator '/'

        //arithmetic operators : +, -, *, /, % cannot be applied to boolean
        // System.out.println(true+false);CTE bad operand types for binary operator '+'

        //+ : mathematical addition, string concatenation
        System.out.println("hello"+ 23+25);//hello2325
        System.out.println(23+25+ "hello");//48hello

        //System.out.println("introduction.Hello"-23);CTE bad operand types for binary operator '-'
        System.out.println(10-4);
    }
}
