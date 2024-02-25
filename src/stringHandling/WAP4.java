package stringHandling;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

//WAP to Count Number of Duplicates Words in String.
public class WAP4 {
    public static void main(String[] args) {
        String str= "java is language python is language both java and python language";
        String word[] =str.split(" ");

        Map<String,Integer> map = new HashMap<>();

        for(String w:word){
            if(map.containsKey(w)){
                map.put(w,map.get(w)+1);
            }else{
                map.put(w,1);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> itr= entrySet.iterator();
        while(itr.hasNext()){
            Map.Entry<String,Integer> entry = itr.next();
            if(1 < entry.getValue() ){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }

        }
    }
}
