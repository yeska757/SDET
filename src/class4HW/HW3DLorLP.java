package class4HW;

import javax.swing.*;
import java.util.Scanner;

/*3)You are DMV representative, and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit.
 */
public class HW3DLorLP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to receive driver's license.");
        } else {
            System.out.println("You are only eligible to receive a learner's permit at this time.");
        }
    }
}
