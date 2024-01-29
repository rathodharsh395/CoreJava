package collectionFramework.setImpl;

public class Course implements Comparable<Course>{
    private Integer courseId;
    private String courseName;
    private String courseDuration;
    private String courseContent;
    private String courseInstructor;
    private Integer courseFees;
    public Course(int courseId,String courseName,String courseDuration,String courseContent,String courseInstructor,int courseFees){
        this.courseId = courseId;
        this.courseName= courseName;
        this.courseDuration=courseDuration;
        this.courseContent=courseContent;
        this.courseInstructor=courseInstructor;
        this.courseFees=courseFees;
    }
    public int compareTo(Course course){
//      code based on what you want to compare
//        if(this.courseFees==course.courseFees){
//            return 0;
//        }
//        if (this.courseFees > course.courseFees){
//            return 1;
//        }
//        if(this.courseFees < course.courseFees){
//            return -1;
//        }     // or
        return this.courseFees.compareTo(course.courseFees);
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
