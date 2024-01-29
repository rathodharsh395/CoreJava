package multithreading;

    class Table
    {
        synchronized void printTable1(int x) // synchronized method.
        {
            for(int i = 1; i <= 3; i++)
            {
                System.out.println(x * i);
                try
                {
                    Thread.sleep(400);
                }
                catch(InterruptedException ie)
                {
                    System.out.println(ie);
                }
            }
        }
    }
    class Thread1 extends Thread
    {
        Table t1; // Declaration of variable t of class type Table.
        Thread1(Table t1)
        {
            this.t1 = t1;
        }
        public void run()
        {
            t1.printTable1(2); // Calling synchronized method.
        }
    }
    class Thread2 extends Thread
    {
        Table t2;
        Thread2(Table t2)
        {
            this.t2 = t2;
        }
        public void run()
        {
            t2.printTable1(10); // Calling synchronized method.
        }
    }

    public class SynchronizedMethod {
        public static void main(String[] args)
        {
           // Create two objects of class Table.
            Table obj1 = new Table();
            Table obj2 = new Table();

            Thread1 t1 = new Thread1(obj1);
            Thread2 t2 = new Thread2(obj2);
            t1.start();
            t2.start();
        }
    }

