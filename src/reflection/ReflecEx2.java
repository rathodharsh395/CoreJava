package reflection;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
class Student{
    public void show(){

    }
    private int display(){
        return 0;
    }
}
public class ReflecEx2 {
    public static void main(String[] args){
        try {
            Class c =Class.forName("reflection.Student");
            Method methods[]= c.getDeclaredMethods();
            for(Method m:methods){
                System.out.println("Method Name: "+m.getName());
                int a =  m.getModifiers();
                System.out.println("Modifiers Name: "+ Modifier.toString(a));
                System.out.println("Return type: "+ m.getReturnType());

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
