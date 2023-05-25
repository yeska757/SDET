package groupProject1;

public class task6prime {
    public static void main(String[] args) {

        /*  6. Write a java program to check whether a given number is prime or not?
                (prime numbers are numbers that are greater than 1, divisible by only 1 and the number itself without leaving a remainder)
        */


        int[] numbers = {7, 14, 23, 36, 45, 52, 68, 75, 83, 99, 1, -7};

        System.out.print("Prime numbers in the array: ");
        for (int num : numbers) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}

