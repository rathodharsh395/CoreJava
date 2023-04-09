package algorithmsAndArrays;

public class SelectionSortString {
    public static void main(String[] args) {
        String a[]={ "Pravin","Raju","Suraj","Akshay","Regex"};

        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min].compareTo(a[j])>0){
                   min=j;
                }
            }
            String temp= a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
