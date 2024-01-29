package collectionFramework.listImpl;

import java.util.Vector;

public class VectorDemo4 {
    public static void main(String[] args) {
        Vector<String> vec= new Vector<>();
        System.out.println("Vector is empty: "+vec.isEmpty());
        vec.add("Hydrogen");
        vec.add("Oxygen");
        vec.add("Boron");
        vec.add("Beryllium");
        vec.add("Boron");
        System.out.println("Elements: "+vec);
        System.out.println("Vector is empty: "+vec.isEmpty());
        vec.setElementAt("Helium",1);
        vec.set(2,"Lithium");
        System.out.println("Element after replacing: "+vec);
        System.out.println("Size of the vector: "+vec.size());
        vec.setSize(8);
        System.out.println("Size of the vector after setting: "+vec.size());
        System.out.println("Capacity of the vector: "+vec.capacity());
    }
}
