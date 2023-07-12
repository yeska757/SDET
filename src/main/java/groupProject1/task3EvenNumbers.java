package groupProject1;

public class task3EvenNumbers {
    public static void main(String[] args) {

        /*  3. Create a 2D array or integer type where you will store odd and even numbers.
                Develop a program which will identify/print the even numbers only.
         */

        int[][] oddEven = {{3, 17, 99, 83, 59, 37, 584, 8462},
                {9824, 984, 50, 29, 99, 32, 3, 5, 8}};

        for (int[] numbers : oddEven) {
            for (int allNumbers : numbers) {
                if (allNumbers % 2 == 0) {
                    System.out.println(allNumbers);
                }
            }

        }


    }
}
