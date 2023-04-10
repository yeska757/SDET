package class6;

import java.util.Scanner;

public class E4LogicalOperators {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your height in in?");
        int height = scan.nextInt();


        if (height < 60) {
            System.out.println("short");
        } else if (height >= 60 && height <= 72) {
            System.out.println("medium");
        } else {
            System.out.println("tall");
        }
    }
}
