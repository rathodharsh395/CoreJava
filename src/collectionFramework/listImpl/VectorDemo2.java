package collectionFramework.listImpl;

import java.util.Vector;

public class VectorDemo2 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("A");
        v.addElement("B");
        v.add("C");
        v.addElement("D");
        v.addElement("E");
        System.out.println("Elements: "+v);
        System.out.println("First Element: "+v.firstElement());
        System.out.println("Last Element: "+v.lastElement());
        System.out.println("Element at 3: "+v.elementAt(3));
        System.out.println("Element F: "+v.contains("F"));

        String[] arr= new String[5];
        v.copyInto(arr);
        System.out.println("Elements in an array arr");
        for(String str:arr){
            System.out.println(str);
        }
        Object obj=v.clone();
        System.out.println("Clone of v: "+obj);

    }
}
