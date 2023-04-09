package controlStatements.loops;

public class Assignment14 {
    public static void main(String[] args) {

        for(int i=1;i<=100;i++) {
            boolean isTrue = true;
            for (int j=2; j<=i/2;j++)
            {
                if (i % j == 0)
                {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) {
                System.out.println(i);
            }
        }
    }

}

