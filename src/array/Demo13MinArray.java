package array;

public class Demo13MinArray {
    public static void main(String[] args) {
        int [] array = {50,40,30,20,2,5};
        int min = Integer.MAX_VALUE;//2147483647
        for(int index=0; index<array.length;index++){
            //      50  < 2147483647
            if(array[index]<min){
                min = array[index];
            }
        }
        System.out.println("minimum number in Array is:"+min);
        System.out.println("-------------------------");
        for(int index=0;index<array.length;index++){
            if(min==array[index]){
                System.out.println("min is at index:"+index);
            }
        }
    }
}
