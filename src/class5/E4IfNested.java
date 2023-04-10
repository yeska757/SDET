package class5;

import javax.swing.*;
import java.util.Scanner;

public class E4IfNested {
    public static void main(String[] args) {

        int money = 5000;
        String day = "monday";
        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping!");
            } else {
                System.out.println("Let's wait for Sunday!");
            }
        } else {
            System.out.println("Let's save more");
        }
    }
}