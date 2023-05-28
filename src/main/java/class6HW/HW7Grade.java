package class6HW;

import java.util.Scanner;

/*Allow user to enter grade (A, B, or C etc...) and then provide explanation:
A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
At the end your program should print which grade was entered by a user with explanation.
 */
public class HW7Grade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        char grade = scan.next().charAt(0);

        if (grade == 'A') {
            System.out.println(grade + " is an excellent grade.");
        } else if (grade == 'B') {
            System.out.println(grade + " is a good grade.");
        } else if (grade == 'C') {
            System.out.println(grade + " is an average grade.");
        } else if (grade == 'D') {
            System.out.println(grade + " is a bad grade.");
        } else {
            System.out.println(grade + " is not an acceptable grade.");
        }
    }
}
