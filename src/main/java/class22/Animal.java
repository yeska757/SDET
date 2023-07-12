package class22;
/*create 3 animals like Dog Cat and Horse
        define 3 common methods in each class like speak eat and sleep.
        create the object of all the classes and call the methods.*/

public abstract class Animal {

    private String name;
    private String color;
    private final String breed;

    Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }

}

class Dog extends Animal {

    Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Dog says Wood Woof");
    }

    @Override
    void sleep() {
        System.out.println("Dog sleeps");
    }

    @Override
    void eat() {
        System.out.println("Dog eats");
    }
}

class Cat extends Animal {
    Cat(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Cat says Meow Meow");
    }

    @Override
    void sleep() {
        System.out.println("Cat sleeps");
    }

    @Override
    void eat() {
        System.out.println("Cat eats");
    }

}


class Horse extends Animal {

    Horse(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void speak() {
        System.out.println("Horse says pfff pfff");
    }

    @Override
    void sleep() {
        System.out.println("Horse sleeps");
    }

    @Override
    void eat() {
        System.out.println("Horse eats");
    }

}
