package operators.arithmetic;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println(10 + 3 * 5 / 4 % 2);
        //11

        String s1 = "deepak";
        String s2 = "java";

        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(10+s1+20);
        System.out.println(10+20+s1);
        System.out.println(s1+20/10);
        System.out.println(s1+10*20);
//        System.out.println(s1+10-20); error  BODMAS rule
    }
}
