package class19;

public class Cat extends Animals {
    static Cat cat = new Cat("Biscuit", "domestic", 6, "gray", 4);

    public Cat(String name, String breed, int age, String color, int noOfLegs) {
        super(name, breed, age, color, noOfLegs);
    }

    public static void main(String[] args) {

        cat.printInfo();
    }
}
