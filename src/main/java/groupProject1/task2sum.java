package groupProject1;

public class task2sum {
    public static void main(String[] args) {

        /*    2. Create an array of integer values.
                 After the array is created, calculate the sum of all stored elements in that array.
         */

        int[] numbers = {57, 92, 6, 34, 71, 46, 23, 60, 31};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of all stored elements in the array is " + sum);


    }
}
