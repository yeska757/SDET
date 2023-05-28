package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        //Scanner is class that can take input from keyboard
        //scan is a variable
        //new is special keyword which creates the object of class
        //system.in means we want to use scanner class for taking user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        //calling the next method to take a string form the user
        String name = scan.next();
        System.out.println("You are amazing " + name);


    }
}
