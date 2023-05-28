package class20;

public class Animal {
    private String name;
    String breed;
    private int age;


    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    void sleep() {
        System.out.println("sleeping");
    }

    void walks() {
        System.out.println("Animal walks");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}
