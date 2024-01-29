package array;

public class RemoveOneElement {
    public static void main(String[] args) {


        int[] a = {10, 40, 30, 80, 60, 20};
        int del_ele = 30;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] ==del_ele){
                for(int j =i;j<a.length-1;j++){
                    a[j] = a[j+1];
                }
                count = count+1;
                break;
            }
        }

        if(count==0){
            System.out.println("element not found");
        }
        else {
            System.out.println("element deleted successfully");
            for(int i = 0;i<a.length-1;i++){
                System.out.print(a[i]+",");
            }
        }
    }
}
