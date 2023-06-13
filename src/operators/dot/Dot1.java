package operators.dot;

public class Dot1
{
    public static void main(String[] args) {
     /*
     *(Dot) "." -- > Matches Any Single Character
      */
        String patt1 = "ABC.";
        String str1  = "ABCD";
        String patt2 = "ABC.*";
        String str2 = "ABC8rijfght";
        System.out.println(patt1.matches(str1));
        System.out.println(patt1.matches(patt2));
        System.out.println(str1.matches(patt2));
        System.out.println(str2.matches(patt2));


    }
}
