package class12HW;

public class cl12HW1midChar {
    public static void main(String[] args) {

       /* Create a String and if the String is not empty perform the following:
        if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
        For Example String str=hello =>l*/


        String weather = "Today is 23 C and thunder";

        if (!weather.isBlank()) {

            if (weather.length() % 2 != 0 && weather.length() >= 3) {

                int middle = weather.length() / 2;
                char midChar = (weather.charAt(middle));
                System.out.println("In String : " + weather + ". the middle character is " + midChar);

            }

        }


    }
}
