package collectionFramework.mapImpl;
import java.util.*;

public class CurtomerOrderApp {
    public static void main(String[] args) {
        Map<Customer, List<Order>> orderMap = new HashMap();

        Customer customer1 = new Customer(1,"Sachin");
        List<Order> orderListCustomer1 = new ArrayList<>();
        orderListCustomer1.add(new Order(1,"Mobile"));
        orderListCustomer1.add(new Order(2,"Laptop"));
        orderListCustomer1.add(new Order(3,"Headphone"));

        Customer customer2 = new Customer(2,"Gambhir");
        List<Order> orderListCustomer2 = new ArrayList<>();
        orderListCustomer2.add(new Order(11,"Camera"));
        orderListCustomer2.add(new Order(12,"Tv"));

        orderMap.put(customer1,orderListCustomer1);
        orderMap.put(customer2,orderListCustomer2);
//        System.out.println(orderMap);

        Set<Map.Entry<Customer,List<Order>>> orders =orderMap.entrySet();
        for (Map.Entry order: orders){
            System.out.println("Customer:"+order.getKey()+",His Order"+order.getValue());
        }
    }

}
class Order{
    private int quantity;
    private String orderName;
    public Order(){ }
    public Order(int quantity,String orderName){
        this.quantity = quantity;
        this.orderName = orderName;
    }
    @Override
    public String toString(){
        return "{"+ quantity +","+orderName+"}";
    }
}
class Customer{
    private int customerId;
    private String customerName;
    public Customer(){ }
    public Customer(int customerId,String customerName){
        this.customerId = customerId;
        this.customerName= customerName;
    }
    public String toString(){
        return "{"+customerId+","+customerName+"}";
    }
}
