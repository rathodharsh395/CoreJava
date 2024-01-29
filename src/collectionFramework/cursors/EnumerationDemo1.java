package collectionFramework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0;i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Object o = e.nextElement();
            Integer i = (Integer) o;
            System.out.print(i);
        }
        System.out.println("\nprinting the odd numbers");
        Enumeration ev = v.elements();
        while (ev.hasMoreElements()){
            Integer i = (Integer)ev.nextElement();
            if(i%2 !=0){
                System.out.print(i);
            }
        }
    }
}
