package stringHandling;

public class Demo14Split {
    public static void main(String[] args) {
        String str= "1,abc,pune,2,xyz,mumbai";
        String[] words = str.split(",");

        for(int index=0;index<words.length;index++){
            System.out.println(words[index]);
        }
        System.out.println(str.length());
        /*
        String[] ref = new String[5];

        for(int index=0; index<ref.length;index++){
            ref[index]= "Khetawat";
        }
        for(int index=0; index<ref.length;index++){
            System.out.println(ref[index]);
        }*/
    }
}
