package collectionFramework.setImpl;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        Set<Course> courses= new TreeSet();
        Course course1=new Course(101,"Core java","80 hours","java8","Mr.Sandeep",8000);
        Course course2=new Course(110,"Advance java", "50 hours", "jdbc","Akshay",5000);

       courses.add(course1);
       courses.add(course2);

        System.out.println(courses);
        //Or use for loop to print seperate
    }
}
