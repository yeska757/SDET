package class20;

public class AnimalTester {

    public static void main(String[] args) {

        Dog dog = new Dog("Masha", "poodle", 1);
        dog.eat();
        dog.walks();
        dog.sleep();

        Cat cat = new Cat("Biscuit", "domestic", 6);
        cat.eat();
        cat.walks();
        cat.sleep();

        Horse horse = new Horse("Loshd", "white", 3);
        horse.eat();
        horse.walks();
        horse.sleep();


    }
}
