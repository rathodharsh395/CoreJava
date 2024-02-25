package java8Features.functionalInterface;
import java.util.function.Function;

public class FunctionExample2 {
    public static void main(String[] args) {
        Function<Integer, Double> half1 = a -> a /2.0;
        Function<Double, Double> add = a -> a + 5;
        System.out.println(half1.andThen(add).apply(10));

        Function<Integer,Double> half2 = a -> a/ 2.0;
        Function<Integer,Integer> sub = a -> a + 5;
        System.out.println(half2.compose(sub).apply(10));
    }
}
