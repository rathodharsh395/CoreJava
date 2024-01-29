package reflection;
import java.lang.reflect.Method;
class Parent{

}
class Person extends Parent{
    public void show(){ }

}
public class ReflecEx1 {
    public static void main(String[] args){
        Person p= new Person();
        Class c = p.getClass();
        String name= c.getName();
        System.out.println("Class Name: "+name);

        Method methods[]=c.getDeclaredMethods();
        for(Method m: methods){
            System.out.println("Method Name: "+m.getName());
        }

        Class superclass= c.getSuperclass();
        System.out.println("Super Class Name: "+superclass);

    }
}
