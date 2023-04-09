package stringHandling;

public class TestStringDemo1 {
    public static void main(String[] args) {
        boolean b=Validator.validatePhone("1147117572");
        System.out.println(b);

        boolean  b1=Validator.validateEmail("upadhayay076@gmail.com");
        System.out.println(b1);
    }
}
