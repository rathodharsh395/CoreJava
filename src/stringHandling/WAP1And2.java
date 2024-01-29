package stringHandling;
import java.util.Scanner;
// WAP to reverse a given String ?
// WAP to check if a given String is Palindrome or not ?
public class WAP1And2 {
    public static void main(String[] args) {

        String rev = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=s.length()-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        if(s.equals(rev)){
            System.out.println(s + " :Is palindrome String");
        }
        else {
            System.out.println(s + " :Is not palindrome String;");
        }
    }
}
