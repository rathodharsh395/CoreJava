package classComponents.This;

public class ThisDemo5 {
    public ThisDemo5(This td) {
        System.out.println("passing this as argument in constructor");
    }
}
    class This {
        void m1() {
            ThisDemo5 re = new ThisDemo5(this);
        }

        public static void main(String[] args) {
            //ThisDemo5 re = new ThisDemo5(this);  CTE
            This t = new This();
            t.m1();
        }
    }
