package reflection;

class Simple{
    void message(){
        System.out.println("hello java");
    }
}
public class NewInstanceMethod {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("reflection.Simple");
            Simple s = (Simple)c.newInstance();
            s.message();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(InstantiationException e){
            e.printStackTrace();
        }
        catch(IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
