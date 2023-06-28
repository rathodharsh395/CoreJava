package controlStatements.transfer_jumpStatements;

public class ContinueDemo2 {
    public static void main(String[] args) {

        //outer label loop
        aa:
        for(int i=0;i<=5;i++){
            //inner label loop
            bb:
            for(int j=1;j<=5;j++){
                //using continue with label
                if(i==j){
                    continue aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
