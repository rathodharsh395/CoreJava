package classComponents;

public class ClassObjectAssignment2Student {
    public static void main(String[] args) {
        ClassObjectAssignment2Student re = new ClassObjectAssignment2Student();
        re.studentDetails("Same",1,1111111111l,"pune maharastra");
        ClassObjectAssignment2Student ref = new ClassObjectAssignment2Student();
        ref.studentDetails("John",2,2222222222l,"mumbai maharastra");
    }
    void studentDetails(String name, int roll_no, long phone, String address){
        System.out.println("Name:"+name + "\t"+
                "Roll NO:"+roll_no+"\t"+
                "Phone NO:"+phone+"\t"+
                "Address:"+address);
    }
}
