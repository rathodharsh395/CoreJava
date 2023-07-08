package controlStatements.loops;
/*      *
       * *
      * * *
     * * * *       */
public class StarPattern7 {
    public static void main(String[] args) {
        System.out.println("Type I: First Way");
        for (int i=1;i<=4;i++){
            for (int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Type I: Second Way");
        StarPattern7 star = new StarPattern7();
        star.secondMethod();
    }
    void secondMethod(){
        for (int i=1;i<=4;i++){
            for(int j=4;j>=1;j--){
                if (j>i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(" *");
                }

            }
            System.out.println();
        }

    }
}
