package operators.logical;

public class Demo2 {
    public static void main(String[] args) {
        int year = 2016;
        System.out.println(
                (year%400==0)
                        ||
                        (year%100!=0 && year%4==0)
        );
    }
}
