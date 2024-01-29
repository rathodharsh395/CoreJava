package extras;

public class RemoveJunk {
    public static void main(String[] args) {
        String s = "@ removing  # SPECIAL $string !*&^ 0123456789";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

        s = s.replaceAll("[^a-zA-Z]","");
        System.out.println(s);
    }
}
