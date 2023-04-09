package controlStatements.loops;

public class Assignment13 {
    public static void main(String[] args) {
        for(int i=152;i<=500;i++) {
            int sum =0;
            int seperate = i;
            for (; seperate!=0;) {
                int lastDigit = seperate % 10;
                sum = sum+ (lastDigit * lastDigit * lastDigit);
                seperate = seperate / 10;
            }
           if(i == sum){
               System.out.println(i);
           }

        }
    }
}

