package classComponents;

public class Demo3 {
    //to access instance variable we need reference variable
    int number1 = 100;//Heap
    int number2 = 200;//Heap
    //to access static variable we need class Name
    static int number3 = 300;//class or method memory area
    static int number4 = 400;//class or method memory area

    public static void main(String[] args) {
        //stack memory area
        //to access local variable we don't need any reference or class name
        //local variable won't be accessible outside the method
        int number1 = 1000;
        int number2 = 2000;
        int number3 = 3000;
        System.out.println(number1 + number2);//3000//addition of local variables
        System.out.println(number3 + number3);//6000//addition of local variables

        //access static variable
        System.out.println("static variable " + Demo3.number3);
        System.out.println("static variable" + number4);

    }
}
