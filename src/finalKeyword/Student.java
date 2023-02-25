package finalKeyword;

  final public class Student {
     private int id;
     private String name;
    public Student(){

    }
   /* final,static,abstract*/Student(int id, String name){
        this.id= id;
        this.name= name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void m1(){
        System.out.println("m1 student");
    }
}
