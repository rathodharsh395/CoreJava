package java8Features;
@FunctionalInterface
public interface NumberProcessor {
    int process(int number);

    public static void main(String[] args) {

        NumberProcessor demo = new Demo();
        NumberProcessor square = (number)-> number*number;
        System.out.println(demo.process(10));
        System.out.println(square.process(10));
    }
}
class Demo implements NumberProcessor{
    @Override
   public int process(int number){
        return number+number;
    }
}