package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.next();

        if (name.equals("Elena")) {
            System.out.println("Mac user");
        } else if (name.equals("Me")) {
            System.out.println("Windows user");
        } else if (name.equals("Safyan")) {
            System.out.println("Naughty");
        } else if (name.equals("Zheka")) {
            System.out.println("You are the best SDET!");
        } else if (name.equals("Alex")) {
            System.out.println("Bad boy");
        }

    }
}
