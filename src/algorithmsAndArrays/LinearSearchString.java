package algorithmsAndArrays;

public class LinearSearchString {
    public static void main(String[] args) {
        String[] arr = {"deepak","rohit","rahul","deepesh","vironika","amit"};
        String item= "rahul";
        int temp=0;
        // by using == .
        for(int i=0;i<arr.length;i++){
            if(item==arr[i]){
                temp=1;
                System.out.println("item present at :"+i);
            }
        }
        // by using equals method.
        for(int j=0;j< arr.length;j++){
            if(arr[j].equals(item)){
                temp=2;
                System.out.println("item present at :"+j);
            }
        }
        if(temp==0){
            System.out.println("item not present in the array");
        }

    }
}
