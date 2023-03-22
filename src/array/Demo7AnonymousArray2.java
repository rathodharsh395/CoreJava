package array;

public class Demo7AnonymousArray2 {
    public static void main(String[] args) {
     //passing anonymous array as parameter
     sum(new int[][]{{20,30},{40,50,60}});
    }
    public static void sum(int[][] no){
        System.out.println(no.length);
        int sum= 0;
        for(int[] i: no){
            for(int j:i){
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
