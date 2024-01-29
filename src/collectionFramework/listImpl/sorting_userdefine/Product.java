package collectionFramework.listImpl.sorting_userdefine;

//@ToString
//this is auto generated keyword by compiler
//this holds the address of current running object
public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private int productPrice;
    public Product(){}
    public Product(int productId,String productName,int productPrice){
        this.productId = productId;
        this.productName=productName;
        this.productPrice=productPrice;
    }
    @Override
    public String toString()
{
    return productId +" "+productName + " "+productPrice;
}
    @Override
    public int compareTo(Product pro) {
    // All possibilities
       // System.out.println(this);
       // return this.productId-pro.productId;
      /* if (this.productId>pro.productId)
        {
            return 1;
        }
        return -1;*/
        return this.productName.compareTo(pro.productName);


    }
}
