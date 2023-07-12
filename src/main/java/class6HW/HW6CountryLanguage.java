package class6HW;

import java.util.Scanner;

/*Ask user to enter their country and capture it. Once values are captured print which language user speaks.
 */
public class HW6CountryLanguage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your country");
        String country = scan.nextLine();

        if (country.equals("United States") || country.equals("Canada") ||
                country.equals("Australia") || country.equals("New Zealand") || country.equals("Ireland")) {
            System.out.println("The language in " + country + " is English.");
        } else if (country.equals("Spain") || country.equals("Mexico") || country.equals("Colombia") ||
                country.equals("Argentina") || country.equals("Peru") || country.equals("Venezuela") ||
                country.equals("Chile") || country.equals("Ecuador") || country.equals("Guatemala") ||
                country.equals("Cuba") || country.equals("Bolivia") || country.equals("Dominican Republic") ||
                country.equals("Honduras") || country.equals("Paraguay") || country.equals("El Salvador") ||
                country.equals("Nicaragua") || country.equals("Costa Rica") || country.equals("Panama") ||
                country.equals("Uruguay") || country.equals("Puerto Rico")) {
            System.out.println("The language in " + country + " is Spanish.");
        } else if (country.equals("Russia") || country.equals("Belarus") || country.equals("Kazakhstan") ||
                country.equals("Kyrgyzstan")) {
            System.out.println("The language in " + country + " is Russian.");
        } else if (country.equals("France") || country.equals("Switzerland") ||
                country.equals("Belgium") || country.equals("Luxembourg") || country.equals("Monaco") ||
                country.equals("Haiti")) {
            System.out.println("The language in " + country + " is French.");
        } else if (country.equals("Algeria") || country.equals("Bahrain") || country.equals("Chad") ||
                country.equals("Comoros") || country.equals("Djibouti") || country.equals("Egypt") ||
                country.equals("Eritrea") || country.equals("Iraq") || country.equals("Jordan") ||
                country.equals("Kuwait") || country.equals("Lebanon") || country.equals("Libya") ||
                country.equals("Mauritania") || country.equals("Morocco") || country.equals("Oman") ||
                country.equals("Palestine") || country.equals("Qatar") || country.equals("Saudi Arabia") ||
                country.equals("Somalia") || country.equals("Sudan") || country.equals("Syria") ||
                country.equals("Tunisia") || country.equals("United Arab Emirates") ||
                country.equals("Western Sahara") || country.equals("South Sudan")) {
            System.out.println("The language in " + country + " is Arabic.");
        } else if (country.equals("Portugal") || country.equals("Brazil") || country.equals("Angola") ||
                country.equals("Mozambique") || country.equals("Guinea-Bissau") || country.equals("Timor-Leste") ||
                country.equals("Equatorial Guinea") || country.equals("Cape Verde")) {
            System.out.println("The language in " + country + " is Portuguese.");
        } else {
            System.out.println("I am not familiar with this country but I will learn in future.");
        }


    }
}
