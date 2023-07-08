package controlStatements.loops;
/*      *
       ***
      *****
     *******       */
public class StarPattern8 extends StarPattern7{
    public static void main(String[] args) {
        System.out.println("Type II: First Way");
        for(int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            for (int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Type II: Second Way");
        StarPattern8 star = new StarPattern8();
        star.secondMethod();
    }

       void secondMethod() {
        for (int i=1;i<=4;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
