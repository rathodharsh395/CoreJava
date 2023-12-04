package array;
// this way is not efficient in case of big list because it is less efficient//
public class FirstDuplicateElement1 {
    public static void main(String[] args) {
        int a[] ={6,5,2,9,1,2,3,4};
        int temp =0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&& i != j){
                    System.out.println("fist duplicate element is "+a[i]);
                    temp=temp+1;
                    break;
                }
            }
            if(temp>0){
                break;
            }
        }
        if(temp==0){
            System.out.println("no duplicate element found");
        }
    }
}
