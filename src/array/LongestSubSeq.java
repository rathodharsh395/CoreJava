package array;

import java.util.HashSet;

public class LongestSubSeq {
    public static void main(String[] args) {
        int a[] ={3,9,1,13,10,4,20,2,11,12};
        HashSet<Integer> hs = new HashSet<>();
        for (int e:a) {
            hs.add(e);
        }
        int long_seq =0;
        for(int i=0;i<a.length;i++){
            if(!hs.contains(a[i]-1)){
                int no= a[i];
                while (hs.contains(no)){
                    no++;
                }
                if(long_seq<no-a[i]){
                    long_seq = no-a[i];
                }
            }
        }
        System.out.println("longest subsequence is:"+long_seq);
    }
}
