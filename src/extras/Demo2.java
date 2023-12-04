package extras;

public class Demo2 {
    public static void main(String[] args) {
        int k=99;
        int x=99;
        while(k<=99&&x>20){
            x=k++;
            if(x<110){
                x=k/5;
            }
            k--;
        }
        System.out.println("Value x="+x);
        System.out.println("VAlue k="+k);
    }
}
