package stringHandling;
// 1. Insert  2. Delete
// 3. Replace 4. Search
// 5. Substring 6.Reverse
// 7. other.
   public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I Java Programming!");
        System.out.println("Original StringBuffer: "+sb);
        sb.insert(2,"Like ");
        System.out.println("New StringBuffer: "+sb);

        sb.delete(7,12);
        System.out.println("After delete(): "+sb);
        sb.deleteCharAt(3);
        System.out.println("After deleteCharAt: "+sb);

        sb.replace(3,5,"ove");
        System.out.println("After replace: "+sb);

        StringBuffer sb2 = new StringBuffer("I am Java Programmer");
        System.out.println("sb2.indexOf(am): "+sb2.indexOf("am"));
        System.out.println("sb2.lastIndexOf(am): "+sb2.lastIndexOf("am"));

        String s1= sb2.substring(5);
        System.out.println("Substring: "+s1);
        String s2= s1.substring(5,12);
        System.out.println("New Substring: "+s2);

        System.out.println("Original StringBuffer: "+sb2);
        sb2.reverse();
        System.out.println("Reversed StringBuffer: "+sb2);

        String s = sb2.toString();
        System.out.println("String representation of StringBuffer: "+s);

        System.out.println("Original capacity: "+sb2.capacity());
        sb2.trimToSize();
        System.out.println("New capacity: "+sb2.capacity());
        System.out.println("Runtime class: "+sb2.getClass());
        System.out.println("Hashcode value: "+sb2.hashCode());

    }
}
