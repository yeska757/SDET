package class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;
    }

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
    }

    public static void main(String[] args) {
        Laptop dellG5 = new Laptop("Dell", "G5", 3, 512, true, false, false);
    }
}
