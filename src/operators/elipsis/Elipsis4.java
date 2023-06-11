package operators.elipsis;

public class Elipsis4 {
    public static void main(String[] args) {
        int[] l ={10,20,30};
        int[] m ={40,50};
        int[] n = {20,30,40};
        m1(l,m,n);

    }
    public static void m1(int[] ... x){
        for(int[]a:x){
            int total=0;
            for (int i=0;i<a.length;i++){
                total=total+a[i];

            }
            System.out.println(total);
        }
    }
}
