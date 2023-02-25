package java8Features;
import java.util.function.Predicate;
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = (x)-> x.equals("ABC");
        System.out.println(predicate.test("ABC"));
        System.out.println(predicate.test("XYZ"));

        Predicate<Integer> integerPredicate = (i)-> i%2 ==0;
        System.out.println(integerPredicate.test(100));
        System.out.println(integerPredicate.test(99));
    }
}
