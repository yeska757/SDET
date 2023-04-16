package class10HW;

public class class10HW3grocery {
    public static void main(String[] args) {

        /* Using 2D array create a grocery list.
            Inside you should have an array of veggies, fruits, dairy and sweets.
                Retrieve all values from that array using 2 different loops
         */

        String[][] groceryList = {{"carrot", "tomato", "potatoes", "peas", "cucumber"},
                {"cherry", "orange", "banana", "strawberry"},
                {"milk", "sour cream", "yogurt"},
                {"ice cream", "chocolate", "macaroons", "cookies", "gummies"}};

        for (int row = 0; row < groceryList.length; row++) {
            for (int col = 0; col < groceryList[row].length; col++) {
                System.out.print(groceryList[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------enhanced loop-----------------");

        for (String[] grocery : groceryList) {
            for (String list : grocery) {
                System.out.print(list + " + ");
            }
            System.out.println();
        }


    }
}
