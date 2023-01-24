package classComponents.This;

public class ThisDemo6 {
    ThisDemo6 m1(){
        return this;
    }
    public static void main(String[] args) {
        ThisDemo6 t =new ThisDemo6();
        t.m1();

    }
}
