import java.util.ArrayList;

public class Report {
    Customer customer;
    Bill bill;
    ArrayList<String> report = new ArrayList<>();
    int billLength;

    Report(Customer customer, Bill bill){
        this.customer = customer;
        this.bill = bill;
        billLength = 0;
    }

    public void generateReport(){

        // Customer details
        report.add("Customer name : " + customer.name);
        report.add("Customer phone number : " + customer.phoneNo);
        report.add("Customer membership type : " + customer.membershipType);
        report.add("Customer discount : " + customer.discount);

        // Itemized bill
        Order order = bill.order;

        for (OrderItem item : order.itemList){
            report.add("Plant ID : " + item.plant.plantId);
            report.add("Plant name : " + item.plant.name);
            report.add("Quantity : " + item.quantity);

            if (item.plant.stockQty <= 5){
                report.add("Warning : Plant ID " + item.plant.plantId + "has low stock!");
            }

            report.add("Care tip : " + item.plant.category.careTip);

            billLength += 1;
        }

        report.add("Bill amount : " + bill.getBillingPrice());
        report.add("Payment mode : " + bill.paymentMode.paymentMode);

    }

    public ArrayList<String> getReport() {
        return report;
    }
}
