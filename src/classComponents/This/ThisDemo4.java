package classComponents.This;

public class ThisDemo4 {
    void m1(ThisDemo4 td){
        System.out.println("method m1");
    }
    void m2(){
        m1(this);
    }

    public static void main(String[] args) {
        ThisDemo4 re = new ThisDemo4();
        re.m2();
    }
}
