package collectionFramework.setImpl;
import java.util.HashSet;
import java.util.Objects;
class Student{
    String name;
    String sName;
    int id;
    public Student(){}
    public Student(String name,String sName,int id){
        this.name = name;
        this.sName = sName;
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && sName.equals(student.sName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, sName, id);
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sName='" + sName + '\'' +
                ", id=" + id +
                '}';
    }
}
public class HashSetDemo3 {
    public static void main(String[] args) {
        HashSet<Student> hset = new HashSet<>();
        Student s1 = new Student("Jhon","RSVM",12);
        Student s2 = new Student("Shubh","DPS",1234);
        Student s3 = new Student("Ricky","DAV",9876);
        Student s4 = new Student("Jhon","RSVM",12);
        Student s5 = new Student("Shubh","ABC",1234);
        hset.add(s1);
        hset.add(s2);
        hset.add(s3);
        hset.add(s4);
        hset.add(s5);
        for(Student s: hset){
            System.out.println(s);
        }
        Student s6 = new Student("Ram","Chandra",55);
        System.out.println(hset.contains(s6));
    }
}

