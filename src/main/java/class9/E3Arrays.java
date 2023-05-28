package class9;

public class E3Arrays {
    public static void main(String[] args) {

        double[] numbers = {10.5, 5.5, 0.05, 100.5, 586, 38957, 9384, 93, 2948, 24};

        // int i = 4;
        //  System.out.println(numbers[i]);

        //numbers.length --> gives number of elements in index
        System.out.println(numbers.length);
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }


    }
}
