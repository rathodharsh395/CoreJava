package array;
//    Kadane's Algorithm    //
public class MaxSumSubArray {
    public static void main(String[] args){
        int []a ={4,-2,-3,4,-1,-2,1,5,-3};
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        int s=0,start=0 ,end=0;
        for(int i=0;i<a.length;i++){
            max_ending_here = max_ending_here+a[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
                start=s ;
                end =i;
            }
            if(max_ending_here<0){
                max_ending_here=0;
                s = i+1;
            }
        }
        System.out.println("Maximum sum of sub array is:"+max_so_far);
        System.out.print("The sub array is:{");
        for (int i=start;i<=end;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("}");
    }
}
