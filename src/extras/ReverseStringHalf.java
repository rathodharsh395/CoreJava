package extras;

import java.util.Scanner;
public class ReverseStringHalf {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        System.out.println("enter any string ");
        String str = hr.nextLine();
        char[] ch = str.toCharArray();
        for(int i=str.length()/2,j=str.length()-1;i<str.length()&&i<j;i++,j--)
        {
            char c = ch[i];
            ch[i]=ch[j];
            ch[j] =c;
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }

    }
}
