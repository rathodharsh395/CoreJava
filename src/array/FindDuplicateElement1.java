package array;
// This method has a flaws. thus not used in case of more than one duplicate element//
public class FindDuplicateElement1 {
    public static void main(String[] args) {
        int []a = {3,5,6,3,2,2,1,3};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&& (i != j)){
                    System.out.println(a[j]+",");
                }
            }
        }
    }
}
