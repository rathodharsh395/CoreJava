package classComponents.Constructor;
/* In java we can copy one object into another using :
1. By constructor
2. By assigning the values of one object into another
3. By clone() method of Object class.
 */
public class CopyObjectUsingConstructor {
    int id;
    String name;
    public CopyObjectUsingConstructor(int i,String n){
        id = i;
        name = n;
    }
    public CopyObjectUsingConstructor(CopyObjectUsingConstructor c){
        id = c.id;
        name=c.name;
    }
    public static void main(String[] args) {
        CopyObjectUsingConstructor original= new CopyObjectUsingConstructor(11,"rathod");
        CopyObjectUsingConstructor copy1= new CopyObjectUsingConstructor(original);

        System.out.println(original.id+" : "+original.name);
        System.out.println(copy1.id+" : "+copy1.name);
    }
}
