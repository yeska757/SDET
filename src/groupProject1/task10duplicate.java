package groupProject1;

public class task10duplicate {
    public static void main(String[] args) {

        //    10. Write a program to print out duplicate elements from an Array of Strings?

        String[] animals = {"Dog", "Cat", "Elephant", "Tiger", "Lion", "Horse", "Dog", "Bear", "Elephant", "Monkey"};

        for (int i = 0; i < animals.length; i++) {
            for (int j = i + 1; j < animals.length; j++) {
                if (animals[i].equals(animals[j])) {
                    System.out.println(animals[j]);
                }
            }
        }


    }
}
