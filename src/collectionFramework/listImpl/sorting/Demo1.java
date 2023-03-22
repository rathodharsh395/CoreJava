package collectionFramework.listImpl.sorting;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {
        List<Product> productList= new ArrayList<>();
        Product product1=new Product(11,"mobile",1000);
        Product product2=new Product(3,"laptop",1000);
        Product product3=new Product(2,"projector",200);
        Product product4=new Product(41,"digital panel",300);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        Collections.sort(productList);//once sort() method invoked, it is internally call compareTo() method by using default object(this)
        for(Product pro: productList){
            System.out.println(pro);
        }
    }
}
