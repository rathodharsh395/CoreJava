package stringHandling;
// Ways to create StrnigBuffer Object .
public class Demo19StringBufferCapacity {
    public static void main(String[] args) {
        // Way 1 :
        StringBuffer sb= new StringBuffer();
        int length= sb.length();
        int capacity= sb.capacity();
        System.out.println("Before adding any character:");
        System.out.println("Lenght="+ length); // 0
        System.out.println("Default initial capacity= "+capacity); // 16
        sb.append("abcdefghijklmnop");
        System.out.println("After adding 16 characters:");
        System.out.println("Lenght= "+sb.length()); //16
        System.out.println("Capacity= "+sb.capacity()); //16
        sb.append("q");
        System.out.println("After Adding 17th character:");
        System.out.println("Lenght= "+sb.length()); //17
        System.out.println("Capacity= "+sb.capacity()); //34
        sb.append("abcdefghijklmnopq");
        sb.append("r");
        System.out.println("After adding 35th character:");
        System.out.println("Lenght= "+sb.length()); //35
        System.out.println("Capacity= "+sb.capacity()); //70
        // Way 2:
        System.out.println("-----------------------");
        StringBuffer sb2= new StringBuffer("Tech");
        System.out.println(sb2.length()); // 4
        System.out.println(sb2.capacity()); // 20

        // Way 3:
        System.out.println("-----------------------");
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.length()); //0
        System.out.println(sb3.capacity()); //30
        System.out.println("-----------------------");

        // Length & Capacity
        StringBuffer lc= new StringBuffer("Hello World!");
        System.out.println("Original string: "+lc);
        System.out.println("Length: "+lc.length());
        System.out.println("Capacity: "+lc.capacity());

        lc.ensureCapacity(40);
        System.out.println("Now, capacity: "+lc.capacity());

        lc.setLength(15);
        System.out.println("Now, length: "+lc.length());
        System.out.println(lc);
    }
}