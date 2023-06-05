package class28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E7Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Please enter an integer");
            scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter proper type of data");

        }


    }
}
