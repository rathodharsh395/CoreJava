package classComponents;
public class ClassObjectAssignment2Student {
    String name;
    int roll_no;
    long phone;
    String address;
    public static void main(String[] args) {
        ClassObjectAssignment2Student re = new ClassObjectAssignment2Student();
        re.studentDetails("Same",1,1111111111l,"pune maharastra");
        ClassObjectAssignment2Student ref = new ClassObjectAssignment2Student();
        ref.studentDetails("John",2,2222222222l,"mumbai maharastra");
        System.out.println(re.name+","+re.roll_no+","+re.phone+","+re.address);
        System.out.println(ref.name+","+ref.roll_no+","+ref.phone+","+ref.address);
    }
    void studentDetails(String n, int r, long p, String a){
        name=n;
        roll_no=r;
        phone=p;
        address=a;
    }
}
