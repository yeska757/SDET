package class9;

import java.util.Scanner;

public class E12ArraysScanner {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scna = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter int numbers");
            numbers[i] = scna.nextInt();
        }

        for (int number : numbers) {
            System.out.println(number);
        }


    }
}
