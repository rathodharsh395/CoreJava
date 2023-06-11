package operators.conditional;

public class ForNesting {
    public static void main(String[] args) {
        int x=10, y=30, z=20;
        System.out.println(
                (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z)
        );
    }
}
