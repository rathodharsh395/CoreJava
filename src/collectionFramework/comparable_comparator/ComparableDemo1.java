package collectionFramework.comparable_comparator;
import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int rollno;
    int age;
    Student(String name, int rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }
    @Override
    public int compareTo(Student st) {
        if (rollno == st.rollno) {
            return 0;
        }
        if (rollno > st.rollno) {
            return 1;
        }
            return -1;
    }
}
public class ComparableDemo1{
    public static void main(String[] args){
        Student st1 = new Student("John",20,15);
        Student st2 = new Student("Peter",15,16);
        Student st3 = new Student("Deep",25,15);
        ArrayList<Student> al= new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        System.out.println("Displaying student's name sorted by rollnos:");
        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.name+" "+st.rollno+" "+st.age);
        }
    }
}
