package stringHandling;
//WAP to get the index of first, second and third occurrence of a character in String.

public class WAP8 {
    public static void main(String[] args) {
        String str = "This is java string occurrence";
        int firstOccurence = str.indexOf('s');

        int secondOccurence = str.indexOf('s',str.indexOf('s')+1);

        int thirdOccurence = str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)+1);

        System.out.println(firstOccurence);
        System.out.println(secondOccurence);
        System.out.println(thirdOccurence);
    }
}
