package class9HW;

public class class9HW5arrayLoopsAnimals {
    public static void main(String[] args) {

        //Create an array of animals and store 5 elements into it.
        // Using 2 different loops print all elements from the array.

        String[] animals = {"Cat", "Dog", "Racoon", "Panda", "Rabbit"};

        for (String animal : animals) {
            System.out.print(animal + " ");
        }

        //or
        System.out.println();

        int a = 0;
        while (a < animals.length) {
            System.out.print(animals[a] + " ");
            a++;
        }

    }
}
