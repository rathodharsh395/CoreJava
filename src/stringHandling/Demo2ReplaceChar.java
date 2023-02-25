package stringHandling;

public class Demo2ReplaceChar {
    public static void main(String[] args) {
        String str = "String hAAAaaadling";
        char [] ch = str.toCharArray();
        for(int index=0; index<ch.length;index++){
            if(ch[index]=='a' ||ch[index]=='A'){
                ch[index]= '@';
            }
        }
        for(int index=0;index<ch.length;index++){
            System.out.print(ch[index]);
        }
    }
}
