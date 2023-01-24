package classComponents.Blocks;
public class InstanceBlock1 {
    int productId;
    static int noOfObjectsCreated;
    public InstanceBlock1(){
        System.out.println("Zero para constructor");
    }
    {
        noOfObjectsCreated++;
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    public static void main(String[] args) {
        InstanceBlock1 ib1= new InstanceBlock1();
        InstanceBlock1 ib2= new InstanceBlock1();
        InstanceBlock1 ib3= new InstanceBlock1();
        System.out.println("No. of objects created for class :"+ noOfObjectsCreated);
        System.out.println(ib1.productId);


    }

}
