package class19;

public class Dog extends Animals {

    static Dog dog = new Dog("Masha", "poodle", 1, "orange", 4, 800);

    double price;

    public Dog(String name, String breed, int age, String color, int noOfLegs, double price) {
        super(name, breed, age, color, noOfLegs);
        this.price = price;
    }

    void printInfo() {
        super.printInfo();
        System.out.println("Price is " + price);
    }

    public static void main(String[] args) {
        dog.printInfo();
    }
}
