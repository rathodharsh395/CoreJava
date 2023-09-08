package algorithmsAndArrays;

public class QuickSortMiddle{
    public static void main(String[] args){
        int[] array = {15,9,7,13,12,16,4,18,11};
        int length = array.length;
        QuickSortMiddle qs = new QuickSortMiddle();
        qs.quickSortRecursion(array,0,length-1);
        qs.printSortedArray(array);
    }
    public int partion(int arr[],int low,int high){
        int pivot=arr[(low+high)/2];
        while(low<=high){
            while(arr[low]<pivot)
            {
                low++;
            }
            while(arr[high]>pivot)
            {
                high--;
            }
            if(low<=high)
            {
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
    public void quickSortRecursion(int[] arr,int low,int high){
        int pi= partion(arr,low,high);
        if(low < pi-1){
            quickSortRecursion(arr,low,pi-1);
        }
        if(pi<high){
            quickSortRecursion(arr,pi,high);
        }
    }
    public void printSortedArray(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
}