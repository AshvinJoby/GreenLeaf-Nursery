import java.util.ArrayList;

public class Order {
    Customer customer;
    ArrayList<OrderItem> order;

    Order(Customer customer, ArrayList<OrderItem> order){
        this.customer = customer;
        this.order = order;
    }
}
