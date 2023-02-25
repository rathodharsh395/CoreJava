package stringHandling;

public class Demo20ForEach {
    public static void main(String[] args) {
    char[] chars = {'a','b','c','d'};
    for (char ch : chars){
        if(ch != 'a'){
            System.out.println(ch);
        }
    }
    int[] array = {11,12,13,14,15,16,17,18,19,20};
    for(final int temp : array){
        if (temp%2==0){
            System.out.println(temp);
        }
    }
    /* Since the "temp" variable goes out of scope with each iteration of the loop,
    it is actually re-declaration each iteration, allowing the same token (i.e. temp)
    used to represent multiple variables */

    }
}
