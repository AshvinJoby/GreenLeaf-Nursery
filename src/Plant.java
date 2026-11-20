public class Plant {

    int plantId;
    String name;
    double pricePerUnit;
    int stockQty;
    String supplier;

    Plant(int plantId, String name, double pricePerUnit, int stockQty, String supplier){
        this.plantId = plantId;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.stockQty = stockQty;
        this.supplier = supplier;
    }
}
