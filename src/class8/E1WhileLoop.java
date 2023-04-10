package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        //   for (int i = 15; i <= 30; i ++) {
        //       System.out.print(i + " ");
        //  }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting point");
        int start = scan.nextInt();
        System.out.println("Enter ending point");
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }


    }
}
