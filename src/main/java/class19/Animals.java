package class19;

public class Animals {

    private String name;
    String breed;
    private int age;
    String color;
    int noOfLegs;

    public Animals(String name, String breed, int age, String color, int noOfLegs) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.noOfLegs = noOfLegs;
    }

    void printInfo() {
        System.out.println(name + " is a " + breed + " and " + age + " years old. " + name + " is color " + color + " and has " + noOfLegs + " legs.");
    }
}
