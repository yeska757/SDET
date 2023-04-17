package groupProject;

public class task1arrayTemp {
    public static void main(String[] args) {

        /*   1. Create a program that uses an array to store a list of temperatures for a week,
                    and then uses a loop to find the highest and lowest temperature for the week.
        */

        int[] temps = {18, 23, 24, 26, 13, 29, 27};

        int highest = temps[0];
        int lowest = temps[0];

        for (int temp : temps) {
            if (temp >= highest) {
                highest = temp;
            }
            if (temp <= lowest) {
                lowest = temp;
            }
        }
        System.out.println("Highest temperature of the week is: " + highest);
        System.out.println("Lowest temperature of the week is: " + lowest);

    }
}
