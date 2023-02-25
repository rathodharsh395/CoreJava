package oops.polymorphism.methodOverloading;

public class Addition {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(Addition.add(20,10));
        System.out.println(a.add(20,10,30));
        System.out.println(add("string","123"));
    }
    static int add(int number1, int number2){
        return number1+number2;
    }
    //CTE: as method return type is not considered for method overloading
    /*static void add(int number1,int number2){
     }*/
    static int add(int number1,int number2, int number3){
        return number1+number2+number3;
    }
    static String add(String str1,String str2){
        return str1+str2;
    }
}
