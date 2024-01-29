package stringHandling;

public class Demo15CompareTo {
    public static void main(String[] args) {
       String str1 = "B";//66
       String str2 = "A";//65

        System.out.println(str1.compareTo(str2));//str1-str2 = 66-65 = 1
        System.out.println(str2.compareTo(str1));//str2-str1 = 65-66 = -1
        //i.e. str2 is 1 smaller than str1 that's why -1.
        // compareTo returns three possible value : zero, positive and negative
        // it compares the strings based on unicode[ascii] value
        System.out.println(66-65);

        String s1 = "a"; // 97
        String s2 = "A"; // 65
        System.out.println(s1.compareTo(s2));  // 32
        System.out.println(s1.compareToIgnoreCase(s2)); // 0
    }
}
