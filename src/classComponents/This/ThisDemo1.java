package classComponents.This;

public class ThisDemo1 {
    int i,j;
    void setValue(int i){
        j = i;
        System.out.println("value of i "+this.i);
    }
    void show(){
        System.out.println("value of j "+j);
    }
    public static void main(String[] args) {
        ThisDemo1 td = new ThisDemo1();
        td.setValue(10);
        td.show();
        //System.out.println(this.i);//CTE
        //this keyword cannot be used in static context[ static method, static block]
    }
}
