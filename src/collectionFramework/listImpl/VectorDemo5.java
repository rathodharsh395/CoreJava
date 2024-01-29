package collectionFramework.listImpl;

import java.util.Vector;

public class VectorDemo5 {
    public static void main(String[] args) {
        Vector<Integer> v= new Vector<>();
        for(int i=0;i<=10;i++){
            if(i%2==0){
                v.add(i);
                System.out.println(i);
            }
        }
        int size= v.size();
        System.out.println("Size of vector: "+ v.size());
        System.out.println("Capacity of vector: "+v.capacity());
        v.ensureCapacity(25);
        System.out.println("Minimum capacity: "+v.capacity());
        v.trimToSize();
        System.out.println("Minimum capacity after trimming: "+v.capacity());
        String str= v.toString();
        System.out.println("String equivalent of the vector: "+str);

        Object[] obj = v.toArray();
        for(int i=0;i<obj.length;i++){
            System.out.print(obj[i]);
        }


    }
}
