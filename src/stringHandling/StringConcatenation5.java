package stringHandling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringConcatenation5 {
    public static void main(String[] args)
    {
        // Create a list of string array.
        List liststr = Arrays.asList("Apple", "Banana", "Orange");
        // Perform joining operation.
        String result = liststr.stream().collect(Collectors.joining(",")).toString();
        // Display the result.
        System.out.println(result);



        // Create a stream of strings.
        Stream stringStream = Stream.of("Apple", "Banana", "Orange");
        // Use Collectors.joining() to concatenate the string elements with a delimiter.
        String re = (String) stringStream.collect(Collectors.joining(", "));
        // Display the concatenated string.
        System.out.println(re);


    }
}
