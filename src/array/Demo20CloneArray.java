package array;

public class Demo20CloneArray {
    public static void main(String[] args) {
      int arr[]={33,3,4,5};
      System.out.println("Printing original array");
      for (int a:arr)
          System.out.println(a);
      System.out.println("printing clone of the arra");
      int carr[]=arr.clone();
      for(int a:carr)
          System.out.println(a);
      System.out.print("Are both equal?:");
        System.out.println(arr==carr);
    }
}
