package class9HW;

public class class9HW7arrayLoopsLargest {
    public static void main(String[] args) {

        //From an array of integer elements find the largest number.

        int[] numbers = {69, 420, 29, 33, 35, 10, 35, 234, 58, 23, 99};

        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number from this array is : " + largest);


    }
}
