package groupProject1;

public class task6prime {
    public static void main(String[] args) {

        /*  6. Write a java program to check whether a given number is prime or not?
                (prime numbers are numbers that are greater than 1, divisible by only 1 and the number itself without leaving a remainder)
        */

        int[] numbers = {7, 14, 23, 36, 45, 52, 68, 75, 83, 99, 1, -7};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 1) {
                if (numbers[i] % 2 == 0 || numbers[i] % 3 == 0) {
                    System.out.println(numbers[i] + " is NOT a prime number");
                } else {
                    System.out.print(numbers[i] + " is a prime number");
                    System.out.println();
                }
            } else {
                System.out.println(numbers[i] + " is NOT a prime number");
            }
        }

    }
}

