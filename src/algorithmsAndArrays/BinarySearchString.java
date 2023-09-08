package algorithmsAndArrays;
public class BinarySearchString {
    public static void main(String[] args) {
        String arr[] = {"abhishek","don","flower","ice age","ice bomb","ice cream"};
        String search = "ice";
        int li = 0 , hi= arr.length-1;
        int middle = (li+hi)/2;

        while (li<=hi) {
            if (arr[middle].compareTo(search) == 0) {
                System.out.println("Present at index: " + middle);
                break;
            } else if (arr[middle].compareTo(search) < 0) {
                li = middle + 1;
            } else {
                hi = middle - 1;
            }
            middle = (li + hi) / 2;
        }
        if(li>hi){
            System.out.println("does not present :");
        }

    }
}
