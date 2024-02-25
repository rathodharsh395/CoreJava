package stringHandling;

import java.util.Arrays;

public class Demo14Split {
    public static void main(String[] args) {
        String str= "My name is, Deepak. I am 26, year old. I live ,in Delhi";
        String[] words = str.split("\\.");
        String[] wor = str.split("\\,");
        String[] wo = str.split(" ");

        printMyArrays(words);
        System.out.println("-----------------");
        printMyArrays(wor);
        System.out.println("-----------------");
        printMyArrays(wo);

//       System.out.println(Arrays.toString(wo));
//       System.out.println(str.length());

        /*
        String[] ref = new String[5];

        for(int index=0; index<ref.length;index++){
            ref[index]= "Khetawat";
        }
        for(int index=0; index<ref.length;index++){
            System.out.println(ref[index]);
        }*/
    }
    static void printMyArrays(String[] s){
        for (int index = 0; index < s.length; index++) {
            System.out.println(s[index]);
        }
    }
}
