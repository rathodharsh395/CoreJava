package controlStatements.loops;
/*       *******
          *****
           ***
            *         */
public class StarPattern9 extends StarPattern7{
    public static void main(String[] args) {
        System.out.println("Way 1st");
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=4;k>=i;k--){
                System.out.print("*");
            }
            for (int l=3;l>=i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Way 2nd");
        StarPattern9 star= new StarPattern9();
        star.secondMethod();
    }
    @Override
    void secondMethod() {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=9;k>(i*2);k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
