package java8Features.lambdaExpression;

public class AfterLambda {
        public static void main(String args[])
        {
            // lambda expression to create the object of type Runnable
            new Thread(() -> {
                System.out.println("New thread created");
            }).start();
        }
}

