package class21HW;

public class Computer {
    private double price;
    private int memory;
    private String operatingSystem;

    public Computer(double price, int memory, String operatingSystem) {
        this.price = price;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
    }

    public void powerOn() {
        System.out.println("Computer turns on.");
    }

    public void powerOff() {
        System.out.println("Computer turns off.");
    }
}

class Apple extends Computer {
    boolean touchBar;

    public Apple(double price, int memory, String operatingSystem, boolean touchBar) {
        super(price, memory, operatingSystem);
        this.touchBar = touchBar;
    }

    @Override
    public void powerOn() {
        System.out.println("Apple emblem shows up.");
    }
}

class Lenovo extends Computer {
     boolean fingerprintReader;

    public Lenovo(double price, int memory, String operatingSystem, boolean fingerprintReader) {
        super(price, memory, operatingSystem);
        this.fingerprintReader = fingerprintReader;
    }

    @Override
    public void powerOff() {
        System.out.println("Lenovo is turning off");
    }
}

class HP extends Computer {
     String serialNumber;

    public HP(double price, int memory, String operatingSystem, String serialNumber) {
        super(price, memory, operatingSystem);
        this.serialNumber = serialNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("HP turns on");
    }

    void firstComputer() {
        System.out.println("HP was my first computer in US.");
    }
}

class Dell extends Computer {
     boolean keyboardBacklight;
     boolean wifiSupport;

    public Dell(double price, int memory, String operatingSystem, boolean keyboardBacklight, boolean wifiSupport) {
        super(price, memory, operatingSystem);
        this.keyboardBacklight = keyboardBacklight;
        this.wifiSupport = wifiSupport;
    }

    @Override
    public void powerOff() {
        System.out.println("Dell turns off");
    }

    void popular() {
        System.out.println("Dell is a very popular computer");
    }
}

