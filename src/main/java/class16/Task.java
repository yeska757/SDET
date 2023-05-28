package class16;

public class Task {

    /* Create a method that will accept an array as parameters
    and will return a sum of all elements from that array.
    Method should be visibly only within same package and
    accessible by the creating an instance of the class.
     */

    int sumArr(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task sum = new Task();
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(sum.sumArr(arr));
    }

}
