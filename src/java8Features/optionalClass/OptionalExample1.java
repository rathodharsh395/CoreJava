package java8Features.optionalClass;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args){
        String[] str = new String[10];
//      String lowercaseString = str[5].toLowerCase();

        Optional<String> optional = Optional.ofNullable(str[5]);
        String lowercaseString = optional.orElse("null value").toLowerCase();

        System.out.println(lowercaseString);
    }
}
