package operators.elipsis;
// elipsis operator introduced int java 1.5 v.
public class Elipsis1 {

    public static void main(String[] args) {
        sum();
        sum(10);
        sum(10,20,30);
        sum(10,20,30,40);
    }
    public static void sum(int ... x){
        int total =0;
        for(int i=0;i<x.length;i++){
            total += x[i];
        }
        System.out.println(total);
    }
}
