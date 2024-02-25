package java8Features.functionalInterface;

import java.util.function.Supplier;

public class SupplierExampl1 {
        public static void main(String []args) {
            Supplier<Double> randomValue = () -> Math.random();
            System.out.println(randomValue.get());
        }
}
