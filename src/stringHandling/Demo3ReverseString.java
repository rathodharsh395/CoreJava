package stringHandling;
// reversing string using array ( toCharArray() method and swapping)
public class Demo3ReverseString {
    public static void main(String[] args) {
        String str = "welcome To IT Shaala";
        String rev = "";
        for(int i= str.length()-1;i >=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}
