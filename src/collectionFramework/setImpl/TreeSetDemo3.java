package collectionFramework.setImpl;
import java.util.*;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        Set<Course> tree1= new TreeSet();
        Course course1=new Course(101,"Core java","80 hours","java8","Mr.Sandeep",8000);
        Course course2=new Course(110,"Advance java", "50 hours", "jdbc","Akshay",5000);
        Course course3=new Course(110,"Advance java", "50 hours", "jdbc","Akiiii",5000);
        tree1.add(course1);
        tree1.add(course2);
        tree1.add(course3);
        System.out.println(course2.compareTo(course3));
        Iterator itr = tree1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        Set<Course>  tree2= new TreeSet();
//        Course course3 = new Course(102,"HTML","20 hours","html5","yahoobaba",1000);
//        Course course4 = new Course(112,"CSS","30 hours","css3","youtube",2000);
//        tree2.add(course3);
//        tree2.add(course4);

    }
}
