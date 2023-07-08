package controlStatements.loops;
/*     123
       654
       789
       121110
       131415        */
public class NumberPattern6 {
    public static void main(String[] args) {
        System.out.println("Snake: I");
        int count=0;
        for(int i=1;i<=5;i++) {
            if(i%2==0)
            {
                int temp=count+1;
                for(int j=count+3;j>=temp;j--,++count){
                    System.out.print(j);
                }
            }
            else
            {
                for (int k=1;k<=3;k++){
                    System.out.print(++count);
                }
            }
            System.out.println();
        }
    }
}
