package classComponents;
import java.util.Scanner;
public class Assignment1Area {
    public static void main(String[] args) {

        Assignment1Area re =new Assignment1Area();
        //System.out.println(re.getArea());

    }
    void setDim(int length,int breadth){
        int area =length*breadth;
    }
    int getArea() {
        System.out.println("enter length and breadth");
        Scanner hr = new Scanner(System.in);

        int length = hr.nextInt();
        int breadth = hr.nextInt();

        Assignment1Area ref = new Assignment1Area();
        ref.setDim(length, breadth);
        return (0);
    }
}
