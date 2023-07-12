package class21;

public class Animal {
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

    void speak() {
        System.out.println("Animal speaks....");
    }

    void sleep() {
        System.out.println("Animal sleeps 1 to 20 hours a day");
    }

    void eat() {
        System.out.println("Animal eats many different things");
    }
}


class Cat extends Animal {

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Meow meow.....");
    }

    @Override
    void eat() {
        System.out.println("Cats like to eat Fish");
    }

    @Override
    void sleep() {
        System.out.println("Cat likes to sleep 15 hours on Average");
    }
}


class Dog extends Animal {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Woof woof");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to chew the bones");
    }

    @Override
    void sleep() {
        System.out.println("Dogs sleep 8 hours");
    }

    void run() {
        System.out.println("Dog likes running");
    }

}


class Horse extends Animal {

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Neigh neigh");
    }

    @Override
    void sleep() {
        System.out.println("Horse sleeps 2-3 hours a day");
    }

    @Override
    void eat() {
        System.out.println("Horse eat carrots and grass");
    }
}


class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Masha", "orange", "poodle");
        dog.printInfo();
        //Parent class variables can store the objects of the child classes
        Animal dog1 = new Dog("Shaggy", "black", "German");
        dog1.printInfo();

        Animal[] animals = {new Dog("Shaggy", "black", "German"), new Cat("Tom", "Blue", "persian")};

        for (Animal animal : animals) {
            animal.printInfo();
        }


    }
}