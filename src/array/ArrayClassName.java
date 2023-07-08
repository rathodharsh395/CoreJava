package array;

public class ArrayClassName {
    public static void main(String[] args) {
        int arra[] = {4,4,5};
        // getting class name of Java array
        Class c=arra.getClass();
        String name= c.getName();

        System.out.println(name);
        System.out.println(arra);
    }
}
