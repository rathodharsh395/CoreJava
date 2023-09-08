package algorithmsAndArrays;
import java.util.Scanner;
// binary search only works on sorted array
public class BinarySearchInteger {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        int item = hr.nextInt();
        int[] arr= {11,11,13,15,15,16,17,17,19,20};
        int li = 0, hi = arr.length-1;
        int middle = (li+hi)/2;
        System.out.println(middle);
        while(li<=hi){
            if(arr[middle]==item){
                System.out.println("item present at :"+ middle+" index");
                break;
            }
            else if(item<arr[middle]){
                hi = middle-1;
            }else {
                li = middle+1;
            }
            middle = (li+hi)/2;

        }

    }
}
