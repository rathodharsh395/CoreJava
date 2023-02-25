package collectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        List list = new LinkedList();//container
        Student student1 = new Student(1,"abc","pune");
        Student student2 = new Student(2,"ijk","pune");
        Student student3 = new Student(3,"mno","pune");
        Student student4 = new Student(4,"pqr","pune");
        Student student5 = new Student(5,"xyz","pune");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        //System.out.println(list);
        for(int index=0;index<list.size();index++){
            System.out.println(list.get(index));
        }

    }
}
