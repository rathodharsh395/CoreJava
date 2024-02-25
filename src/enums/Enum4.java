package enums;
import static java.lang.System.*;
public class Enum4 {

    enum Day{ SUNDAY, MONDAY,SATURDAY}

    public static void main(String[] args) {
        Day d = Day.SATURDAY;

        switch (d){
            case MONDAY:
                out.println("Working day starts");
            case SUNDAY:
            case SATURDAY:
                out.println("holiday");break;
            default:
                out.println("working day");

        }
    }
}
