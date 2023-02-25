package classComponents.Constructor;
//no argument Constructor
//Compiler defined Constructor
public class DefaultConstructor {
    int i ;
    String name;
    public static void main(String[] args) {
        DefaultConstructor def= new DefaultConstructor();
        System.out.println("Integer="+def.i +"\n"+"String="+ def.name);
    }
}
