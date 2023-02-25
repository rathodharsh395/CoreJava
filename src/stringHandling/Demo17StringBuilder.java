package stringHandling;

public class Demo17StringBuilder {
    public static void main(String[] args) {
        //StringBuilder stringBuilder = "abc";//CTE: Incompatible
        StringBuilder stringBuilder = new StringBuilder("string");
        stringBuilder.append(" handling");
        System.out.println(stringBuilder);
        stringBuilder.insert(0,2);
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(7);
        System.out.println(stringBuilder);

        stringBuilder.insert(7,' ');
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
