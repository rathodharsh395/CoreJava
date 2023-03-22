package collectionFramework.queueImpl;
import collectionFramework.setImpl.Course;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        Queue<Course> courses= new PriorityQueue<>();
        Course course1= new Course(11,"Core Java","80 hours","java8","Mr.Sandeep",40000);
        Course course2= new Course(15,"Advance java","40 hours","jdbc,servlet,jsp","Mr.Sandeep",80000);
        Course course3= new Course(12,"Professiona java","40 hours","jdbc,servlet,jsp","Mr.Sandeep",50000);

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        for(int index= 0;index<=2;index++){
            System.out.println(courses.poll());
        }

    }
}
