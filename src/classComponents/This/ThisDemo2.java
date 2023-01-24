package classComponents.This;

public class ThisDemo2 {
    int i;
 void display()
 {
     System.out.println("hello");
 }
 void show()
 {
     System.out.println("java");
     this.display(); // Same :-  display();
     //[If you don’t use this keyword, compiler automatically adds this keyword while invoking the method]
 }
    public static void main(String[] args)
    {
        ThisDemo2 re = new ThisDemo2();
        re.show();
    }
}
