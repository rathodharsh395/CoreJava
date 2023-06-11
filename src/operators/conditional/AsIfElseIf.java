package operators.conditional;
import java.util.Scanner;
public class AsIfElseIf {
    public static void main(String[] args) {
        Scanner hr=new Scanner(System.in);
        int marks= hr.nextInt();
        System.out.println(marks==50?"Average":(marks>50?"Above average":"Below average34"));
    }
}
