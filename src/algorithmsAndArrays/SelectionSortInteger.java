package algorithmsAndArrays;

public class SelectionSortInteger {
    public static void main(String[] args) {
        int []a= {45, 65, 76, 85, 45, 54, 66};
        for(int i=0; i<a.length;i++){
            int min=i;
            for(int j= i+1;j<a.length;j++){
                if (a[j] < a[min]) {
                    min =j;
                }
            }
            int temp= a[i];
            a[i]= a[min];
            a[min]= temp;
        }
        System.out.print(" {");
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+",");
        }
        System.out.println("}");
    }
}
