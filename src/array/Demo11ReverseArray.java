package array;

public class Demo11ReverseArray {
    public static void main(String[] args) {
        int[] array1 = {100,200,10,12,6};
        int left = 0;
        int right = array1.length-1;

        while (left<= right){
            int temp = array1[left];
            array1[left]=array1[right];
            array1[right]=temp;
            left++;
            right--;
        }
        System.out.println("After Reversing Array:");
        int index =0;
        while (index< array1.length){
            System.out.print(array1[index]+",");
            index++;
        }
    }
}
