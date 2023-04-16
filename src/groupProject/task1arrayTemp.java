package groupProject;

public class task1arrayTemp {
    public static void main(String[] args) {

        //1. Create a program that uses an array to store a list of
        //temperatures for a week, and then uses a loop to find
        //the highest and lowest temperature for the week.


        int[] temps = {29, 23, 24, 26, 19, 18, 27};

        int highest = temps[0];

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > highest) {
                highest = temps[i];
            }

        }


    }
}
