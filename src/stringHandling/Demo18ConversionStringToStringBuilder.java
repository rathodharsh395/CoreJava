package stringHandling;

public class Demo18ConversionStringToStringBuilder {
    public static void main(String[] args) {
     String str = "welcome";
     StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("stringBuilder:"+stringBuilder);

     StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("stringBuffer:"+stringBuffer);

     StringBuilder sb1 = new StringBuilder("welcome back");
     StringBuffer sb2 = new StringBuffer("welcome back");

     String str1 = new String(sb1);
        System.out.println(str1);
     String str2 = new String(sb2);
        System.out.println(str2);
    }
}
