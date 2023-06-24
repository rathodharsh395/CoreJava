package VariableDatatype;

public class DataTypeDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        double c = (double) a/b;
        double d = a/b;
        System.out.println(c);
        System.out.println(d);
        double e = 10;
        double f = 20;
     // int g = (int) e/f; CTE
     // int h = (int) f/e; CTE
        int  i = (int) ((int) e / f);
        System.out.println(i);
     // int j = e; // CTE
        int j = (int) e;
    }
}
