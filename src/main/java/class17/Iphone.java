package class17;

public class Iphone {
    String make;
    String model;
    int storage;
    double price;

    //to create automatically: right click--> generate--> constructor--> select--> ok
    public Iphone(String make, String model, int storage, double price) {
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.price = price;
    }
}
