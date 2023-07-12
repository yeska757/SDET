package class20;

public class Cat extends Animal {
    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    void walks() {
        System.out.println("Cat is running like crazy at night");
    }
}
