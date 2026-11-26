import java.util.ArrayList;

public class Order {
    Customer customer;
    ArrayList<OrderItem> itemList;

    Order(Customer customer, ArrayList<OrderItem> order){
        this.customer = customer;
        this.itemList = order;
    }
}
