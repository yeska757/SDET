package class9;

public class E10Arrays {
    public static void main(String[] args) {

        int [] numbers = {45,34,254,24235,234,234,};
        //iter   ---> shortcut for inhanced for loop
        for (int n : numbers) {
            System.out.print(n + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }



    }
}
