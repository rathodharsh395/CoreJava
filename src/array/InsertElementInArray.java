package array;

public class InsertElementInArray {
    public static void main(String[] args){
        int a[] = {10,20,30,40,50,60,70,80,90};
        int pos = 5;
        int element = 100;
        for(int i=a.length-1;i>=pos;i-- ){
            a[i] = a[i-1];
        }

        a[pos-1] = element;
        for(int i=0 ; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
