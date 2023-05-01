package class15;

public class E3ArraySum {
    // create a method that takes an array as input. It adds all the numbers
    // from the array and returns the sum. name of the method should be sumArr

    int sumArr(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        E3ArraySum sum = new E3ArraySum();
        int[] array = {10, 10, 40};
        System.out.println(sum.sumArr(array));

    }


}
