package classComponents;
public class Method13 {
    static int perfect(int index){
        int sum = 0;
        for(int i=1;i<=index/2;i++){
            if(index%i==0){
                sum += i;
            }
        }
            return sum;
    }
    public static void main(String [] args)
    {
        for(int index=1;index<=10000;index++) {
            if (Method13.perfect(index) == index) {
                System.out.println(index);
            }
        }
    }
}
