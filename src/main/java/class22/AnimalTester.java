package class22;

public class AnimalTester {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Masha", "orange", "poodle"), new Cat("Biscuit", "gray", "domestic"), new Horse("Hersie", "white", "horse Make")};

        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
            animal.speak();
            animal.printInfo();
        }


    }
}
