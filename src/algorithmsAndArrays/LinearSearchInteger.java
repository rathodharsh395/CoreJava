package algorithmsAndArrays;

public class LinearSearchInteger {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 1, 4, 2};
        int element = 4, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                temp = 1;
                System.out.println("element is prsent at: " + i + " index");
            }
        }
        if (temp == 0) {
            System.out.println("element not found");
        }
    }
}
