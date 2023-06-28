package controlStatements.transfer_jumpStatements;

public class BreakDemo1 {
    public static void main(String[] args) {
        //outer loop
        for(int i=0;i<=5;i++){
            //inner loop
            for(int j=1;j<=5;j++) {
                if (j == 2)
                { //using break statement inside inner loop
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
