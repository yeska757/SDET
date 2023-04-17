package groupProject;

public class task4sumEvenOdd {
    public static void main(String[] args) {

       /*   4. Create a 2D array of integers.
                Develop a program which will calculate the sum of even and odd numbers for that array.
        */

        int[][] evenOdd = {{12, 42, 76, 6, 5, 100, 80},
                {14, 17, 82, 8, 5, 23, 19}};

        int sumEven = 0;
        int sumOdd = 0;
        for (int[] numbers : evenOdd) {
            for (int allNumbers : numbers) {
                if (allNumbers % 2 == 0) {
                    sumEven += allNumbers;
                } else {
                    sumOdd += allNumbers;
                }
            }
        }
        System.out.println("The sum of all even numbers is : " + sumEven);
        System.out.println("The sum of all odd numbers is : " + sumOdd);


    }
}
