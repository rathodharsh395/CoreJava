package classComponents;

public class Student {
    //instance variable : specific to object
    int rollNumber;
    String studentName;
    String batch;
    String studyingInYear;

    //static variable : common for all the objects
    static String collageName;

    public static void main(String[] args) {
        //local variable
        int rollNumber;
        String studentName;
        String batch;
        String studyingInYear;
        String collageName;
    }
    int add (int number1, int number2){
        return number1 + number2;
    }
}
