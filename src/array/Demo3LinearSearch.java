package array;

public class Demo3LinearSearch {
    public static void main(String[] args) {
        int[] array = {11,12,1,54,59};
        int element = 54;

        for(int index=0; index<array.length;index++){
            if(element == array[index]){
                System.out.println("element is present at\t"+index);
            }
        }
    }
}
