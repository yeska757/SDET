package groupProject;

public class task9secondLargest {
    public static void main(String[] args) {

        // 9. Write a java program to find the second-largest number in the array?

        int[] numbers = {73, 19, 42, 57, 38, 84, 11, 96, 66, 50};

        int largest = numbers[0];
        int secondLargest = numbers[0];


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
        }
        System.out.println("Second largest number in the array is : " + secondLargest);

    }
}
