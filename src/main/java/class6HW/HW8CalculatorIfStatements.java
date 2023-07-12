package class6HW;

import java.util.Scanner;

/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
 */
public class HW8CalculatorIfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number for your calculation: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number for your calculation: ");
        int num2 = scan.nextInt();
        System.out.println("Enter an operator you want to use (+,-,*,/): ");
        char operator = scan.next().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (operator == '-') {
            System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (operator == '*') {
            System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
        } else if (operator == '/') {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
        } else {
            System.out.println("Wrong entry.");
        }
    }
}
