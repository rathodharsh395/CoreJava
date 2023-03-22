package array;

public class Demo7AnonymousArray1 {
    public static void main(String[] args) {
        //anonymous array
        add(new int[]{10,20,30});
    }
    public static void add(int[] integers){
        System.out.println("size of an array "+ integers.length);
        for(int index=0; index<integers.length;index++){
            System.out.println(integers[index]);
        }
    }
}
