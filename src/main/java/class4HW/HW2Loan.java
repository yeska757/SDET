package class4HW;

import java.util.Scanner;

/*2) You are a loan specialist, and you need to ask user what is the amount of loan
is needed. If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client.
 */
public class HW2Loan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the loan amount you would like to request?");
        int loanReq = scan.nextInt();
        if (loanReq <= 200000) {
            System.out.println("Congratulations! You are approved!");
        } else {
            System.out.println("Sorry, we are unable to approve your request at this time.");
        }
    }
}
