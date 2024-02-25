package stringHandling;
//WAP to Reverse Each Word of a String.

public class WAP5 {
    public static void main(String[] args) {
        String str= "WAP to Reverse Each Word of a String.";
        String rev = "";
        String []words = str.split(" ");

        for(int i=0;i<words.length;i++){
            String s = words[i];
            rev = rev +" "+revString(s);
        }
        System.out.println(rev);
    }
    static String revString(String s){
        String reverse ="";
        for(int i=s.length()-1;i>=0;i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
}
