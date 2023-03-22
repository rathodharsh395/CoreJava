package extras;

public class DemExample {
    public static void main(String[] args) {
        int arr[]={1,3,6,8,9,8};
        int del= 3;
        for(int i=0; i<arr.length; i++) {
            if (del == arr[i]) { // trying to access illegal index value //AIOBE
                for (int j = i; j < arr.length - 1; j++) { //i =1;
                    arr[i] = arr[i + 1];       //loop will execute 4 times
                }
            }
            System.out.println(arr[i] + " ");
            String str = new String();
        }
    }
}

