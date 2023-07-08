package controlStatements.loops;
public class NumberPattern8{
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=8;k>=(i*2);k--){
                if(k%2==0)
                {
                    System.out.print("1");
                }
                else {
                    System.out.print('0');
                }
            }
            System.out.println();
        }
    }
}
