package stringHandling;

public class Demo3ReverseString {
    public static void main(String[] args) {
        String str = "welcome To IT Shaala";
        char [] ch= str.toCharArray();
        int left =0;
        int right = ch.length-1;
        while(left<right){
          char chars = ch[left];
          ch[left]= ch[right];
          ch[right]= chars;
          left++;
          right--;
        }
        for(int index=0;index<ch.length;index++){
            System.out.print(ch[index]);
        }
    }
}
