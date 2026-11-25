public class Plant {

    int plantId;
    String name;
    double pricePerUnit;
    int stockQty;
    PlantCategory category;
    Supplier supplier;

    Plant(int plantId, String name, double pricePerUnit, int stockQty, PlantCategory category, Supplier supplier){
        this.plantId = plantId;
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.stockQty = stockQty;
        this.category = category;
        this.supplier = supplier;
    }
}
