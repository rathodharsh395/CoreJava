package stringHandling;

public class StringConcatenation2 {
        public static void main(String[] args)
        {
            String s1 = "Scientech";
            String s2 = " Easy";
            String s = String.format("%s%s",s1,s2);
            System.out.println(s.toString());

            String name = "Tripti";
            int age = 23;
            String st = "student";
            // Use String.format() to create a formatted string.
            String formatted = String.format("My name is %s, and I am %d years old %s.", name, age, st);
            // Printing the formatted string.
            System.out.println(formatted);
        }
}