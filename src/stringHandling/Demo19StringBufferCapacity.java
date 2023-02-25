package stringHandling;

public class Demo19StringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("HR");
        System.out.println("Capacity "+stringBuffer.capacity());//by default : 16
        System.out.println("Length "+ stringBuffer.length());// by default : 0

    }
}