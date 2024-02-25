package enums;

public class Enum1 {

    public enum Days {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};

    public static void main(String[] args) {
        for(Days d: Days.values()){
            System.out.println(d);
        }

        System.out.println("Value of SUNDAY is:"+Days.valueOf("SUNDAY"));
        System.out.println("Index of SUNDAY is:"+ Days.valueOf("SUNDAY").ordinal());
        System.out.println("Index of MONDAY is:"+ Days.valueOf("MONDAY").ordinal());
    }
}
