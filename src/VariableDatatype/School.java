package VariableDatatype;

public class School {
    // Declaration of a primitive variable.
    String name= "RSVM";
    public static void main(String[] args) {
        //Creating an object of the class.
        School sc= new School(); //sc is variable of data type non-primitive.
        // thus sc is a reference variable.
        // Print the address of the memory location of an Object.
        System.out.println(sc);
        System.out.println(sc.name);

    }
}
