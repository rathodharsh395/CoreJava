package stringHandling;

public class Demo7Concat {
    public static void main(String[] args) {
    String str1 = "string handling";
    String str2 = "is now in progress";
    System.out.println(str1+str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.concat(str2));
        System.out.println(str1);//string handling is now in progress
        System.out.println(str2);// is now in progress

        String s1 = new String("Java");
        s1.concat(" Core");
        s1 = s1.concat(" Programming");
        System.out.println(s1);
    }

}
