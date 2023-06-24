package controlStatements.conditionalStatement;
// java switch example where we are omiting the break statement
public class SwitchDemo1 {
    public static void main(String[] args) {
        int num = 20;
        switch (num) {
            case 10: System.out.println("10");
            case 20: System.out.println("20");
            case 30: System.out.println("30");
            case 40: System.out.println("40");
            default:
                System.out.println("Not in 10,20,30,40");
        }

    }
}
