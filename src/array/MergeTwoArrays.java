package array;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int []a= {10,20,30};
        int []b= {40,50,60,70,80};
        int c_length= a.length+b.length;
        int c[] = new int[c_length];

        for(int i=0;i<a.length;i++){
            c[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i] = b[i];
        }

        for(int i=0;i<c_length;i++){
            System.out.print(c[i]+",");
        }
    }
}
