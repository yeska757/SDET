package class16;

public class Dog {
    String color;
    String name;
    String breed;

    static int age;

    void bark() {
        System.out.println(name + " is barking");
    }

    void printInfo() {
        if (breed.equals("German")) {
            System.out.println(name + " " + color + " i can work in NYPD");
        } else {
            System.out.println(name + " can be used as Pet");
        }
    }

}
