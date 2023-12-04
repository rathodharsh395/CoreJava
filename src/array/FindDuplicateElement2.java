package array;
import java.util.HashSet;
import java.util.Set;
// This method too has a flaws. thus not used in case of more than one duplicate element//
public class FindDuplicateElement2 {
    public static void main(String[] args) {
        int a[] = {3,5,4,3,2,2,1,3};
        Set<Integer> s = new HashSet<>();

        for(int no:a){
            if(s.add(no)==false){
                System.out.println(no);
            }
        }
    }
}
