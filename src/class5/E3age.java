package class5;

import java.util.Scanner;

public class E3age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("Sorry, you can't drive now.");
        } else {
            System.out.println("You can drive now!");
        }
    }
}
