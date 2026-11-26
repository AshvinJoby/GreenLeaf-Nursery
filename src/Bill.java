import java.util.ArrayList;

public class Bill {
    Order order;
    String paymentMode;
    double billingPrice;

    Bill(Order order, String paymentMode){
        this.order = order;
        this.paymentMode = paymentMode;
    }

    public void processBill(){
        double subtotal = 0;
        ArrayList<OrderItem> orderItems = order.itemList;

        for (OrderItem item : orderItems) {
            Plant plant = item.plant;
            double itemPrice = plant.pricePerUnit * plant.stockQty;
            subtotal += itemPrice * plant.category.discount;
        }

        // order discount is subtotal is more than 1,000
        if (subtotal > 1000){
            subtotal *= 0.9;
        }

        // customer discount
        billingPrice = subtotal * (1.0 - order.customer.getDiscount());

        // GST
        billingPrice *= 1.05;

        // payment processing fee
        if (paymentMode.equals("Card")){
            billingPrice *= 1.02;
        }
    }

    public double getBillingPrice() {
        return billingPrice;
    }
}
