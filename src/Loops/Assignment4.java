package Loops;
public class Assignment4
{
    public static void main(String[] args) {
        int column = 7;
        int i;
        for (i = 1; i <= 7; i+=2)
        {
            for (int j = column; j >= i; j--)
            {
                if (j % 2 == 0)
                {
                    System.out.print(0);}
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
            for (int k = 1; k <=i; k+=2) {
                System.out.print(" ");
            }
        }
    }
}
