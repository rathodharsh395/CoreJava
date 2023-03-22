package collectionFramework.setImpl;

public class Course implements Comparable<Course>{
    private int courseId;
    private String courseName;
    private String courseDuration;
    private String courseContent;
    private String courseInstructor;
    private int courseFees;
    public Course(int courseId,String courseName,String courseDuration,String courseContent,String courseInstructor,int courseFees){
        this.courseId = courseId;
        this.courseName= courseName;
        this.courseDuration=courseDuration;
        this.courseContent=courseContent;
        this.courseInstructor=courseInstructor;
        this.courseFees=courseFees;
    }
    public int compareTo(Course course){
        return course.courseFees-this.courseFees;
    }
    public String toString(){
        return  "Course{"+
                "courseID="+courseId+
                ",courseName="+courseName+
                ",courseDuration="+courseDuration+
                ",courseContent="+courseContent+
                ",courseInstructor="+courseInstructor+
                ",courseFees="+ courseFees+" }";
    }
}
