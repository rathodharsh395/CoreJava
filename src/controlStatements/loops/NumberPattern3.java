package controlStatements.loops;
/*  1
    121
    12321
    1234321    */
public class NumberPattern3 {
    public static void main(String[] args) {
        System.out.println("triangle: type V");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
