import java.util.List;

public class Order {
    int noOfItems;
    List<OrderItem> order;

    Order(int noOfItems, List<OrderItem> order){
        this.noOfItems = noOfItems;
        this.order = order;
    }
}
