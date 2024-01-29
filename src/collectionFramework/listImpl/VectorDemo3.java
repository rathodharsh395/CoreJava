package collectionFramework.listImpl;

import java.util.Vector;

public class VectorDemo3 {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add("Bat");
        v.add("Ball");
        v.add("Wicket");
        v.add("Stump");
        v.add("Pitch");
        v.add(25);
        v.add(null);
        System.out.println("Elements: "+v);
        System.out.println("Element at 5: "+v.get(5));
        System.out.println("HashCode value: "+v.hashCode());
        System.out.println("index of element null: "+v.indexOf(null));
        v.insertElementAt("Gloves",6);
        v.removeElement(25);
        v.remove(6);
        System.out.println("Elements after removing: "+v);
    }
}
