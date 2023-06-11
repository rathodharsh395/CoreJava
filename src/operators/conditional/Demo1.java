package operators.conditional;

public class Demo1 {
    public static void main(String[] args) {
        int x= 20;
        int y= 20;
        ++x;
        y++;
        System.out.println(x>y?x:y);
        System.out.println(y);
    }
}
