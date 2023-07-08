package controlStatements.loops;
/*   *     *
      *   *
       * *
        *           */
public class StarPattern12 {
    public static void main(String[] args) {
        // referenced by pyramid pattern
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=8;k>=(i*2);k--){
                if(k<8 && k>(i*2))
                {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
