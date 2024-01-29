package stringHandling;

public class StringConcatenation3 {
    public static void main(String[] args){

    String s1 = new String("Scientech");
    String s2 = new String("Easy");
    String s = String.join(" ",s1,s2,s1);
    System.out.println(s);
  }
}
