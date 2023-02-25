package array;

public class Demo12MaxArray {
    public static void main(String[] args) {
        int [] array1= {10,20,30,50,40,25};
        int max = Integer.MIN_VALUE;
        int index=0;
        while (index<array1.length){
            if (array1[index]>max){
                max = array1[index];
            }
            index++;
        }
        System.out.println("maximum number is: "+max);
    }
}
