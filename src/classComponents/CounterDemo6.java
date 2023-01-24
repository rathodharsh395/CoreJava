package classComponents;
//How instance variable and static variable are stored
//How reference variable get us to particular object
public class CounterDemo6 {
    int count1=0;
    static int count2 = 0;
    CounterDemo6()
    {
     count1++;
     count2++;
        System.out.println("Count1 "+count1+"\t"+"Count2 "+count2);
    }
    public static void main(String[] args)
    {
      CounterDemo6 c1 = new CounterDemo6();
      CounterDemo6 c2 = new CounterDemo6();
      CounterDemo6 c3 = new CounterDemo6();
        System.out.println(c1+"\n"+c2+"\n"+c3);
    }
}
