package array;

public class Demo4EvenNumbers {
    public static void main(String[] args) {
        int [] arry = {11,2,34,54,59};

        for(int index=0; index<arry.length;index++){
           if(arry[index]%2==0){
               System.out.println(arry[index]);
           }
        }
    }
}
