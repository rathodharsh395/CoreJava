package collectionFramework.comparable_comparator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Alphabetic implements Comparator<String>{
    @Override
    public int compare(String s1,String s2){
        return s1.compareTo(s2);
    }
}
class Reverse implements Comparator<String>{
    @Override
    public int compare(String s1,String s2){
        return s2.compareTo(s1);
    }
}
public class ComparatorDemo3 {
    public static void main(String[] args)throws NumberFormatException, IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("How many elements you want to enter");
        int size = Integer.parseInt(br.readLine());
        String[] str = new String[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter your string");
             str[i] =  br.readLine();
        }

        Alphabetic alpha = new Alphabetic();
        Arrays.sort(str,alpha);
        System.out.println("Alphabetic sorting of string");
        for(String s: str){
            System.out.print(s +"\n");
        }
        Reverse rev = new Reverse();
        Arrays.sort(str,rev);
        System.out.println("Reverse sorting of string");
        for(String s: str){
            System.out.print(s +"\n");
        }
    }
}
