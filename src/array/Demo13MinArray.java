package array;

public class Demo13MinArray {
    public static void main(String[] args) {
        int [] array = {50,40,30,2,20,5};
        int min = Integer.MAX_VALUE;//2147483647
        int i =0;
        for(int index=0; index<array.length;index++){
            //      50  < 2147483647
            if(array[index]<min){
                min = array[index];
                i = index;
            }
        }
        System.out.println("minimum number in Array is:"+min);
        System.out.println("-------------------------");
        System.out.println("index of minimum number is :"+ i);
    }
}
