package classComponents;
import java.util.Scanner;
public class ClassObjectAssignment10AddDistance {
    private int feet1;
    private int inches1;
    private int feet2;
    private int inches2;
    public ClassObjectAssignment10AddDistance(int feet1,int inches1,int feet2,int inches2){
        this.feet1=feet1;
        this.inches1=inches1;
        this.feet2=feet2;
        this.inches2=inches2;
    }

    public int getTotalFeet() {
        return feet1+feet2;
    }
    public int getTotalInches(){
        return inches1+inches2;
    }
    public void addDistances(){
        int totalFeet= getTotalFeet();
        int totalInches = getTotalInches();
        if(totalInches >=12){
            totalFeet += totalInches/12;
            totalInches = totalInches%12;
        }
        System.out.println("Total Distance:"+totalFeet+"."+totalInches+" feet");
        System.out.println("\t\t\t"+"i.e:"+totalFeet+"feet"+totalInches+"inches");
    }
}
 class Main {
     public static void main(String[] args) {
         Scanner hr = new Scanner(System.in);
         System.out.println("Enter Distance1 in feet and inches" );
         int feet1= hr.nextInt();
         int inches1 = hr.nextInt();
         System.out.println("Enter Distance2 in feet and inches");
         int feet2 = hr.nextInt();
         int inches2 = hr.nextInt();
        ClassObjectAssignment10AddDistance re = new ClassObjectAssignment10AddDistance(feet1,inches1,feet2,inches2);
        re.addDistances();
    }
}

