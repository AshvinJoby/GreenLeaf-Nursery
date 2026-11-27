import java.util.ArrayList;

public class Bill {
    Order order;
    PaymentMode paymentMode;
    double billingPrice;

    Bill(Order order, PaymentMode paymentMode){
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

        // order discount if subtotal is more than 1,000
        if (subtotal > 1000){
            subtotal *= 0.9;
        }

        // customer discount
        billingPrice = subtotal * (1.0 - order.customer.getDiscount());

        // GST
        billingPrice *= 1.05;

        // payment processing fee
        billingPrice *= (1.0 + paymentMode.processing_fee_percent);
    }

    public double getBillingPrice() {
        return billingPrice;
    }
}
