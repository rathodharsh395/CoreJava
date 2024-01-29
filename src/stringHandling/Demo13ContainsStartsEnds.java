package stringHandling;

public class Demo13ContainsStartsEnds{
    public static void main(String[] args) {
        String str = new String("string handling");
        boolean str2 = str.contains("hand");
        boolean str3 = str.contains("String");
        System.out.println("str2: " +str2);
        System.out.println("str3: " +str3);

        System.out.println(str.indexOf("n"));

        System.out.println("string starts with st:"+str.startsWith("st"));
        System.out.println("string ends with ing:"+str.endsWith("ing"));

    }
}
