package class12HW;

import java.util.Scanner;

public class cl12HW3 {
    public static void main(String[] args) {

       /* Write a program that reads two people's first names and if they're expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Mom’s first name?");
        String momName = scan.next();
        System.out.println("Dad’s first name?");
        String dadName = scan.next();
        System.out.println("Boy or Girl?");
        String gender = scan.next();
        gender = gender.toLowerCase();
        String babyBoyName = dadName.substring(0, 3) + momName.substring(momName.length() - 2);
        String babyGirlName = momName.substring(0, 2) + dadName.substring(dadName.length() - 3);


        if (gender.equals("boy")) {
            System.out.println("Suggested baby " + gender + " name for " + dadName + " and " + momName + " is " + babyBoyName);
        } else if (gender.equals("girl")) {
            System.out.println("Suggested baby " + gender + " name for " + momName + " and " + dadName + " is " + babyGirlName);
        } else {
            System.out.println("Invalid gender input");
        }


    }
}
