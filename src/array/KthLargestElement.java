package array;
/* for second-smallest element replace > with < and */
import java.util.Scanner;
public class KthLargestElement {
    public static void main(String[] args) {
        int[] a = {5,8,12,3,7,6,2,4};
        Scanner hr = new Scanner(System.in);
        int k = hr.nextInt();
        int temp = 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if(i==k-1){
                System.out.println(k+"th largest element is :"+a[i]);
                break;
            }
        }
    }
}
