package controlStatements.loops;
/*   *             *
      *           *
       *    &    *
        *       *           */
public class StarPattern11 {
    public static void main(String[] args) {
        System.out.println("Diagonal 1st");
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                if(j==i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Diagonal 2nd");
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                if(j!=i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
