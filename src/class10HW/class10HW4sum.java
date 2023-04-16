package class10HW;

public class class10HW4sum {
    public static void main(String[] args) {

        /*Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.
         */

        int[][] nums = {{1, 2, 3},
                {44, 55, 66},
                {777, 888, 999}};

        int sum = 0;

        for (int col = 0; col < nums.length; col++) {
            for (int row = 0; row < nums.length; row++) {
                sum += nums[col][row];
            }
        }
        System.out.println("The sum of all numbers is equals to: " + sum);

    }
}
