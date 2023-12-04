package extras;

public class Demo1 {
    public static void main(String[] args) {
        int i=25;
        i--;
        do{
            int p=i++;
            System.out.println("Value of P="+p);

        }while (i>24);
        System.out.println("Value of i="+ i);

    }
}
