package stringHandling;

public class Demo9Replace {
    public static void main(String[] args) {
        String str1 = "sale ko bum se udaa dunga";
        str1 = str1.replace('a', '@');
        System.out.println(str1);

        String str2 = "I am ionman ";
        str2 = str2.replace("ionman","Thor");
        System.out.println(str2);
    }
}
