package class4HW;

import java.util.Scanner;

/*4)Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into Celsius and print “The temperature is
the city  is ”
 */
public class HW4TempCity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the city");
        String city = scan.nextLine();
        System.out.println("Please enter temperature in Fahrenheit");
        int tempF = scan.nextInt();
        int tempC = (tempF - 32) * 5 / 9;
        System.out.println("The temperature in " + city + " is " + tempC + "° Celsius.");


//uidfhiughfdg
        //ujdfhudhj

    }
}
