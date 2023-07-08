package controlStatements.loops;
/*       *
        * *
       *   *
      *     *      */
public class StarPattern13 {
    public static void main(String[] args) {
        //referenced from pyramid pattern
        for (int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=2;k<=(i*2);k++){
                if(k>2 && k<(i*2)){
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
