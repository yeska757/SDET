package class10HW;

public class class10HW5OddEven {
    public static void main(String[] args) {

        /* Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
        Develop a program which will identify/print the even numbers only.
         */

        int[][] numbers = {{4, 16, 23, 24},
                {5, 10, 17, 20},
                {29, 66, 30, 45}};

        for (int col = 0; col < numbers.length; col++) {
            for (int row = 0; row < numbers[col].length; row++) {
                if (numbers[col][row] % 2 == 0) {
                    System.out.println(numbers[col][row] + " is an even number");
                }
            }
        }
        System.out.println();
    }
}
