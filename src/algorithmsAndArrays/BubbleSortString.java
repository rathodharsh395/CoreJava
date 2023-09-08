package algorithmsAndArrays;

public class BubbleSortString {
    public static void main(String[] args) {
        String[] a= {"prashant","swapnil","bhushan","suraj","bheem"};

        for(int i=0;i<a.length;i++){
            int flag= 0;
            for(int j=0;j<a.length-1-i;j++){
                if(a[j].compareTo(a[j+1])>0){
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag =1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
        String p = "prashant";
        String s = "swapnil";
        System.out.println(p.compareTo(s)>0); // -ve
        System.out.println(s.compareTo(p));   // +ve
    }
}
