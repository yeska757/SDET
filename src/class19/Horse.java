package class19;

public class Horse extends Animals {
    static Horse horse = new Horse("Hersie", "Thoroughbred", 3, "white", 4);

    public Horse(String name, String breed, int age, String color, int noOfLegs) {
        super(name, breed, age, color, noOfLegs);
    }

    public static void main(String[] args) {

        horse.printInfo();
    }

}
