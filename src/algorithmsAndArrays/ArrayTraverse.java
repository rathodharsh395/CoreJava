package algorithmsAndArrays;
// Printing The Elements of Arrays By 4 different ways

public class ArrayTraverse {
    public static void main(String[] args) {
        int[] a={10,20,30,40};
        //Way1: Using for Loop
       /* for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        //Way2: Using for-each Loop
        /* for(int i: a){
            System.out.println(i);
        }*/
        //Way3: Using while Loop
        /*int i=0;
        while (i<a.length){
            System.out.println(a[i]);
            i++;
        }*/
        //Way4: Using do-while loop
        int i=0;
        do{
            System.out.println(a[i]);
            i++;
        }while(i<a.length);

    }
}
