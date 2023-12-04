package array;
/* for second-smallest value replace > with < and */
public class SecondLargestWay1 {

    public static void main(String[] args) {
        int [] a = {6,8,2,3,4,5,1,7};
        int temp = 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]>a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if(i==1){
                System.out.println("second largest element :"+a[1]);
                break;
            }
        }
    }
}
