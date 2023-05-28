package class18;

public class Dog {

    String name;
    String color;
    String breed;

    int age;
    double weight;

    public Dog(String name, String color, String breed, int age, double weight) {
       /* this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;*/
        //calling the constructor from the same class that takes (name, color, breed, age) as a parameter
        this(name, color, breed, age);
        this.weight = weight;
    }

    public Dog(String name, String color, String breed, int age) {
       /* this.name = name;
        this.color = color;
        this.breed = breed;*/
        this(name, color, breed);
        this.age = age;
    }

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }


}
