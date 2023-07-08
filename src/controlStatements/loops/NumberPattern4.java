package controlStatements.loops;
/*     54321
       5432
       543
       54
       5          */
public class NumberPattern4 {
    public static void main(String[] args) {
        System.out.println("triangle: type VI");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
