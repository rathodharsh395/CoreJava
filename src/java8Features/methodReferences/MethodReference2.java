package java8Features.methodReferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student{
    private String name;
    private Integer age;
    public Student(String  name,int age){
        this.age=age;
        this.name=name;
    }
    public Integer getAge(){return  age;}
    public String getName(){return name;}
    @Override
    public String toString() {return "Student{" +"name='"+name+ '\''+", age="+age+ '}';}
}
class ComparisonProvider{
    public int compareByName(Student a,Student b){
        return a.getName().compareTo(b.getName());
    }
    public int compareByAge(Student a,Student b){
        return a.getAge().compareTo(b.getAge());
    }
}
public class MethodReference2 {
    public static void main(String[] args) {
        List<Student> studenlist = new ArrayList<>();
        studenlist.add(new Student("vicky", 24));
        studenlist.add(new Student("poonam", 25));
        studenlist.add(new Student("sachin", 19));

        ComparisonProvider cp= new ComparisonProvider();

        System.out.println("Sort by name : using lambda");
        Collections.sort(studenlist,(a,b)-> cp.compareByName(a,b));
        studenlist.forEach(System.out::println);

        System.out.println("Sort by age : using method reference");
        Collections.sort(studenlist,cp::compareByAge);
        studenlist.forEach(System.out::println);
    }
}
