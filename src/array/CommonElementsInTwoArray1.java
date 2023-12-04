package array;
// less efficient thus no used //
import java.util.HashSet;

public class CommonElementsInTwoArray1 {
    public static void main(String[] args) {
        int []a={4,3,7,9,2,4,8};
        int []b={5,1,4,8,3,4};
        HashSet<Integer> hs= new HashSet<>();

        for(int i=0;i<a.length;i++){
           for(int j=0;j<b.length;j++){
               if(a[i]==b[j]){
                   hs.add(a[i]);
                   break;
               }
           }
        }
        for (int no:hs) {
            System.out.println("Common elements are:"+no+"\t");
        }
    }
}
