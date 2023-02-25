package classComponents.Constructor;
//No argument Constructor
//User defined Constructor
 class Test {
    int num;
    String name;
    Test(){
        //this.name= "abc";//instead of custom default values you define your own dummy values.
        //this.num= 10;
        System.out.println("ZeroParameterConstructor called");
    }

}
public class ZeroParameterConstructor {
     public static void main(String[] args) {
        Test t = new Test();
       // t.num=10;   Output: 10
        //t.name=harsh; Output:harsh
        System.out.println("num="+t.num+"\n"+"name"+t.name);//Output : 0 null

    }
}
