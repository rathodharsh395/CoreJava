package reflection;

import java.lang.reflect.Constructor;

class Employee{
    public void Employee(){

    }
}
public class ReflecEx3 {
    public static void main(String[] args) {
        Class c = Employee.class;
        Constructor cons[] =c.getDeclaredConstructors();
        for (Constructor c1:cons){
            System.out.println("Constructor Name: "+c1.getName());
        }
    }
}
