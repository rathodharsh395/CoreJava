package java8Features;

public interface Addition {
    int add(int num1,int num2);

    public static void main(String[] args) {
        //Addition addition =  ( num1, num2)->  num1+num2;
        Addition addition = Integer::sum;
        System.out.println(addition.add(10,20));

    }
}
