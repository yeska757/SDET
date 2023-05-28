package class12HW;

public class cl12HW2reverse {
    public static void main(String[] args) {

        // Create a String and print it in reverse order (Sunday → yadnuS).


        String word = "Biscuit";

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }


    }
}
