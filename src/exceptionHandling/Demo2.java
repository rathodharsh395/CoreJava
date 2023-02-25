package exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        //System.out.println(array[3]);
        throw new ArrayIndexOutOfBoundsException("Index Out Of Bounds");
        // throw keyword used to throw predefined or userdefined exception
        // exception explicitly.
        // Mostly userdefined.


    }
}
