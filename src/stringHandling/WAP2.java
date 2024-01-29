package stringHandling;
// WAP to find the maximum & minimum occurring character in give String

import java.util.HashMap;
import java.util.Map;

public class WAP2 {
    public static void main(String[] args) {
        String s = "This is demo abc xyz i";

        s = s.replaceAll("\\s","");  // removing spaces
        int[] arr = new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)] = arr[s.charAt(i)]+1; // character will be auto promoted to int
        }
        int max = -1;
        char ch= ' ';

        for(int i=0;i<s.length();i++){
            if(max<arr[s.charAt(i)]){
                max = arr[s.charAt(i)];
                ch = s.charAt(i);
            }
        }
        System.out.println("Max :" + ch);

        // Map way for max occurring character
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] c=s.toCharArray();
        for(char ca:c){
            if(hm.containsKey(ca)){
                hm.put(ca,hm.get(ch)+1);
            }
            else{
                hm.put(ca,1);
            }
        }
        int maxCount=0;
        char maxChar = ' ';
        for(Map.Entry<Character,Integer> me:hm.entrySet()){
            if(maxCount<me.getValue()){
                maxCount = me.getValue();
                maxChar= me.getKey();
            }
        }
        System.out.println("Maximum Repeated character :"+ maxChar);

    }
}
