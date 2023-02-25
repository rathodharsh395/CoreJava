package finalKeyword;

public class Demo1final {
    public static void main(String[] args) {
        final int abc = 20;
        //for final variable we cant reassign the value
       // abc = 30;//CTE
        final Student student = new Student(1,"abc");
       //student = null; //CTE
        Student student2 = new Student(2,"xyz");
        //student = student2;//CTE
    }
}
