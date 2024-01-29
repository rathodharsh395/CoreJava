package generics;

public class MyClass<X>{
    X obj;
    MyClass(X obj){
        this.obj = obj;
    }
    X getObject(){
        return obj;
    }
}
 class GenericsTest{
    public static void main(String[] args){
        Integer i= 20;
        MyClass<Integer> obj= new MyClass<Integer>(i);
        System.out.println("Stored value: "+obj.getObject());
        Double d = 20.25;
        MyClass<Double> obj2= new MyClass<Double>(d);
        System.out.println("Stored value: "+obj2.getObject());
        String str="Scientech Easy";
        MyClass<String> obj3= new MyClass<String>(str);
        System.out.println("Stored value: "+obj3.getObject());
    }
}