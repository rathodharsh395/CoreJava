package collectionFramework.listImpl.sorting;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//this is auto generated keyword by compiler
//this holds the address of current running object
public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private int productPrice;
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
        return pro.productName.compareTo(this.productName);


    }
}
