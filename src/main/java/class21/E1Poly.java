package class21;

public class E1Poly {
    public static void main(String[] args) {

        Animal[] animals = {new Dog("Masha", "orange", "poodle"),
                new Cat("Biscuit", "gray", "domestic"),
                new Horse("Hersie", "white", "horseMake")};

        for (Animal animal : animals) {
            animal.sleep();
            animal.eat();
            animal.speak();
        }


        Animal animal = new Dog("Masha", "orange", "poodle");
        //we must type cast the animal back to dog to call the
        //run method only exists in the Dog class
        Dog d = (Dog) animal;
        d.run();
        //direct way
        ((Dog) animal).run();
        // int num = (int)10.5;

    }
}
