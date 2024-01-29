package stringHandling;

public class Demo9Replace {
    public static void main(String[] args) {
        String str1 = "sale ko bum se udaa dunga";
        str1 = str1.replace('a', '@');
        System.out.println(str1);

        String str2 = "This is Demo ";
        str2 = str2.replace("is","was");
        System.out.println(str2);

        str2 = str2.replaceFirst("was","is");
        System.out.println(str2);

        str1 = str1.replaceAll("@","a");
        System.out.println(str1);
    }
}
