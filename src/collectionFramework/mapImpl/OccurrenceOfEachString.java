package collectionFramework.mapImpl;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachString {
    public static void main(String[] args) {
        String str= "java developer is creating apps React is creating apps";
        String[] stringArray =str.trim().split(" ");
        Map<String,Integer> strCountMap = new HashMap<>();

        for(String string:stringArray){
            if(!strCountMap.containsKey(string)){
                strCountMap.put(string,1);
            }
            else{
                strCountMap.put(string,strCountMap.get(string)+1);
            }
        }
        System.out.println(strCountMap);
    }
}
