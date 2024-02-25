package java8Features.lambdaExpression;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Person{
    Integer age;
    String name;
    public Person(int age,String name){
        this.age= age;
        this.name=name;
    }
}
public class LambdaExpressionComparator {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person(21,"Himanshu"));
        list.add(new Person(13,"Ram"));
        list.add(new Person(2,"Dikshita"));
        System.out.println("Sorting on the basis of name of the person---");

        //implementing lambda expression
        Collections.sort(list,(p1,p2)-> {
            return p1.name.compareTo(p2.name);
        });
        //printing sorted list
        for(Person p:list){
            System.out.println(p.name+" "+p.age);
        }
        System.out.println("Sorting on the basis of age of the person---");
        list.sort((p1,p2)->{
            return p1.age.compareTo(p2.age);
        });
        for (Person p:list){
            System.out.println(p.name+" "+p.age);
        }

    }
}
