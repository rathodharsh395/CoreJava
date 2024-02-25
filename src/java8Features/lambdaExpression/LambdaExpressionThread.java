package java8Features.lambdaExpression;

public class LambdaExpressionThread {
    public static void main(String[] args) {
        //Thread Example without lambda
        //creating object of type runnable
        //and overriding run method using anonymous class
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run method task1");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        //Thread Example with lambda
        //using lambda to override the function
        Runnable r2 = ()->System.out.println("run method task2");
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
