package array;
/* for second-smallest value replace > with < and
   Integer.MIN_VALUE with Integer.MAX_VALUE */
public class SecondLargestWay2 {
    public static void main(String[] args) {
        int arr[]= {6,9,3,4,9,1,5,7};
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }else if(arr[i]>second_largest && arr[i] !=largest){
                second_largest = arr[i];
            }

        }
        if(second_largest==Integer.MIN_VALUE){
            System.out.println("there is no second largest element in the list");
        }
        else {
            System.out.println("second largest :"+second_largest);
        }

    }
}
