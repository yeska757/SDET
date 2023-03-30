package class6HW;

import java.util.Scanner;

/*Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in March, April, May → season =”Spring”
if user is born in June, July, August →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season __”.
 */
public class HW4Seasons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What month were you born in?");
        String month = scan.nextLine();

        if (month.equals("March") || month.equals("April") || month.equals("May")) {
            System.out.println("The season you were born in is Spring.");
        } else if (month.equals("June") || month.equals("July") || month.equals("August")) {
            System.out.println("The season you were born in is Summer.");
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            System.out.println("The season you were born in is Autumn.");
        } else if (month.equals("December") || month.equals("January") || month.equals("February")) {
            System.out.println("The season you were born in is Winter.");
        } else {
            System.out.println("Wrong month");
        }
    }
}
