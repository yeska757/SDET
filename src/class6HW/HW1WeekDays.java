package class6HW;

import java.util.Scanner;

/*Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, any day from 6-7 → output
“It is a weekend”,any other day → output “Invalid day”
 */
public class HW1WeekDays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter week day number: ");
        int weekDay = scan.nextInt();

        if (weekDay >= 1 && weekDay <= 5) {
            System.out.println("It is a weekday");
        } else if (weekDay == 6 || weekDay == 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}
