package class9;

public class E10ArraysEnhancedForLoop {
    public static void main(String[] args) {

        int[] numbers = {45, 34, 254, 24235, 234, 234,};
        //iter   ---> shortcut for enhanced for loop
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
