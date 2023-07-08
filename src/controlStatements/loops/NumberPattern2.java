package controlStatements.loops;
/*   1         1
     23    &   21
     456       321
     78910     4321    */
public class NumberPattern2 {
    public static void main(String[] args) {
        System.out.println("triangle: type III");
        int count =0 ;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++count);
            }
            System.out.println();
        }
        System.out.println("triangle: type IV");
        for(int i=1;i<=4;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
