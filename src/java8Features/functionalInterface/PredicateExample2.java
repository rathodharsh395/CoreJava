package java8Features.functionalInterface;
import java.util.function.Predicate;

public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) ->  i > 10;
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

        boolean result1 = greaterThanTen.and(lowerThanTwenty).test(5);
        System.out.println(result1);

        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(5);
        System.out.println(result2);

        boolean result3 = greaterThanTen.or(lowerThanTwenty).test(5);
        System.out.println(result3);

    }
}
