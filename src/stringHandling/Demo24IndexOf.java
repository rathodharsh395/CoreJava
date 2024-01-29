package stringHandling;

public class Demo24IndexOf {
    public static void main(String[] args) {
        String str= "Programming";

        System.out.println("str.indexOf(m): "+ str.indexOf("m"));
        System.out.println("str.lastIndexOf(m): "+str.lastIndexOf("m"));
        System.out.println("str.indexOf(g): "+ str.indexOf("g"));
        System.out.println("str.lastIndexOf(g): "+ str.lastIndexOf("g"));
        System.out.println("str.lastIndexOf(x): "+str.lastIndexOf("x"));//-1
        
    }
}
