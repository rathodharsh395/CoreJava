package algorithmsAndArrays;

public class BubbleSortInteger{
    public static void main(String[] args) {
        int[] a ={ 36,19, 29, 12, 5};
        int i=0;
        while(i <a.length){
            int flag= 0;
            for (int j=0;j< a.length-1-i;j++){
                if(a[j+1]< a[j]){
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag  = 1;
                }
            }
            i++;
            if(flag ==0) break;
            /*// flag is used to break outer loop executing if
            inner loop did not swap value at least one time i.e.
            array is sorted early.
             */
        }
        for(int k=0;k< a.length; k++){
            System.out.println(a[k]);
        }
    }
}
