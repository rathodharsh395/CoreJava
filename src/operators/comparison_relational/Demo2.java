package operators.comparison_relational;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(10 > 10);//false
        System.out.println(10 < 10);//false
        System.out.println(10 != 10);//false
        System.out.println(10 == 10);//true
        System.out.println(10 >= 10);//true
        System.out.println(10 <= 10);//true
        System.out.println('A'==65);//true
        System.out.println('A'!=65);//false
        System.out.println('A'!='B');//true
        //System.out.println('A'=="A");
        //System.out.println(true==10);
        System.out.println(65.0f=='A');//true
        System.out.println("abc"=="abc");//true
    }
}
