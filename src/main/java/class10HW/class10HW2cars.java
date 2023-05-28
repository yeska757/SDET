package class10HW;

public class class10HW2cars {
    public static void main(String[] args) {

        /* Create 2D array of cars : american, german, korean, italian.
            Then retrieve all values from that array using 2 different loops
         */

        String[][] cars = {{"american", "german", "korean", "italian"},
                {"Ford", "Audi", "Hyundai", "Fiat"}};


        for (int col = 0; col < cars.length; col++) {
            System.out.println(cars[1][col] + " is a " + cars[0][col] + " car.");
        }

        System.out.println("--------------------other type of loop-------------------------");

        for (String[] car : cars) {
            for (String c : car) {
                System.out.println(c);
            }
        }

    }
}
