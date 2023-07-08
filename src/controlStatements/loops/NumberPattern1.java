package controlStatements.loops;
/* 1         1
   12        22
   123   &   333
   1234      4444  */
public class NumberPattern1 {
    public static void main(String[] args) {
        System.out.println("triangle: type I");
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("triangle: type II");
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
