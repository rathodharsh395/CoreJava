package classComponents;
import java.util.Scanner;

import static java.lang.System.*;

public class ClassObjectAssignment1Area {
    int recLength ;
    int recBreadth;
    public static void main(String[] args) {
        ClassObjectAssignment1Area re =new ClassObjectAssignment1Area();
        System.out.println("enter length and breadth");
        Scanner hr = new Scanner(System.in);

        int length = hr.nextInt();
        int breadth = hr.nextInt();
        re.setDim(length, breadth);
        System.out.println(re.getArea());
    }
    void setDim(int Length,int Breadth){
        recLength = Length;
        recBreadth = Breadth;
    }
    int getArea() {
        return recBreadth*recLength;
    }

}
