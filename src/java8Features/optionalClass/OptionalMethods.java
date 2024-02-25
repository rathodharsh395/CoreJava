package java8Features.optionalClass;

import java.util.Optional;
public class OptionalMethods {
    String name;
    public Optional<String> getName(){
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
        String str = "java";
        Optional<String> optional1 = Optional.of(str);
        Optional<String> optional2 = Optional.empty();

        System.out.println(optional1.isPresent());
        System.out.println(optional1.get());
        System.out.println(optional1.orElse("no value in this object"));

        OptionalMethods om = new OptionalMethods();
        om.name = "durgesh";
        System.out.println(om.getName().orElse("null value"));

        System.out.println(optional1.filter(a -> a == "java").orElse("null value") );
    }
}
