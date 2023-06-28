package controlStatements.transfer_jumpStatements;

public class BreakDemo2 {
    public static void main(String[] args) {
        //outer label loop
        aa:
        for(int i=0;i<=5;i++){
            //inner label loop
            bb:
            for(int j=1;j<=5;j++){
                if(i==2&&j==2){
                    //using break statement with label
                    break aa;
                }
                System.out.println(i+" "+j);
            }

        }
    }
}
