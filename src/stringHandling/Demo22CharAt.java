package stringHandling;

public class Demo22CharAt {
    public static void main(String[] args) {
        String str = "I love my country";
        int count = 0;
        for(int i = 0; i <= str.length() - 1; i++){
            if(str.charAt(i) == 'o')
            {
                count++;
            }
        }
        System.out.println("Frequency of character o: " +count );
    }
}
