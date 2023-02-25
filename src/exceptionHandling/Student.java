package exceptionHandling;
// In demo24
public class Student {
    int id;
    String name;
    public Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    public Student(){

    }
    public String toString(){
        return "Student{"+
                "id="+ id+", name='"+name+'\''+
                '}';
    }
}
