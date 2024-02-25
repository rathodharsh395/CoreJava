package enums;

public class Enum3 {
    enum Stationary{
        BOOK(6),PEN(3),PENCIL(2),CAMPASS(1);
        private int value;
        private Stationary(int value){
            this.value= value;
        }
    }

    public static void main(String[] args) {
        for (Stationary  s:Stationary.values()){
            System.out.println(s+":"+s.value);
        }
    }
}
