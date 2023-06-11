package operators.elipsis;

public class Elipsis2 {
    public static void main(String ... args) {
      //sum();CTE
        sum(10);
        sum(10,20,30,30,40);
    }
    public static void sum(int x,int ... y){
        System.out.println(x+y[0]+y[1]);

    }
    // Invalid Statement
    /*
    public static void m1(int ... x, int y){

    }
    public static void m2(int ... x, int ...y){

    */
}
