package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElement3 {
    public static void main(String[] args) {
        int a[] = {3,5,4,3,2,2,1,3,4,3};
        Map<Integer,Integer> hm = new HashMap<>();
        for(int no:a){
            Integer count = hm.get(no);
            if(count==null){
                hm.put(no,1);
            }else {
                count=count+1;
                hm.put(no,count);
            }
        }
        // Set have stored all the keys whose value is greater than one //
        Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for(Map.Entry<Integer,Integer> me:es){
            if(me.getValue()>1){
                System.out.println(me.getKey());
            }
        }

    }
}
