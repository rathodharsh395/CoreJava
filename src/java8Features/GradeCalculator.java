package java8Features;

import com.sun.javafx.collections.NonIterableChange;

@FunctionalInterface
public interface GradeCalculator {
    public abstract boolean isPass(int score);

    public static void main(String[] args) {
        GradeCalculator ref = ( score)-> score>=35;
        System.out.println("Are you pass:"+ref.isPass(80));
    }
}
