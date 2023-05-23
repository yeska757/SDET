package groupProject1;

public class task7Fibonacci {
    public static void main(String[] args) {

        //   7. Write a Java Program to print the first 10 numbers of Fibonacci series.
        //              **0, 1, 1, 2, 3, 5, 8, 13, 21, 34**
        //      (The Fibonacci numbers are a series of numbers in which each number is the sum of the two preceding numbers)

        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;


        for (int num = 2; num < fib.length; num++) {
            fib[num] = fib[num - 1] + fib[num - 2];
        }

        for (int fibo : fib) {
            System.out.print("first 10 numbers of Fibonacci series: " + fibo + " ");
        }


    }
}
