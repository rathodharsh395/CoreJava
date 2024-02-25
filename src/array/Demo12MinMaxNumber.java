package array;

public class Demo12MinMaxNumber {
    public static void main(String[] args) {
        int a[] = {-1, -2, -3, -1, -2, -3, -4};
        int minNum = a[0];
        int maxNum = a[0];

        for(int i = 0; i < a.length; i++){
            if(a[i]>maxNum){
                maxNum = a[i];
            }
            else if(a[i]<minNum){
                minNum = a[i];
            }
        }

        System.out.println("Minimum: "+minNum +"\n"+"Maximum: "+maxNum);
    }
}
