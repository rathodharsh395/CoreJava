package java8Features.lambdaExpression;

public class BeforeLambda {
        public static void main(String args[])
        {
            // create anonymous class object
            new Thread(new Runnable() {
                @Override public void run()
                {
                    System.out.println("New thread created");
                }
            }).start();
        }
}

