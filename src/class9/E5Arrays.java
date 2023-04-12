package class9;

public class E5Arrays {
    public static void main(String[] args) {


        for (int i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        char[] symbols = {'A', 'B', 'C', 'D', 'E'};
        for (int j = 0; j < symbols.length; j += 2) {
            System.out.print(symbols[j] + " ");
        }


    }
}
