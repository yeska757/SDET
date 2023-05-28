package class9HW;

public class class9HW8arraysLoopsReverseChars {
    public static void main(String[] args) {

        //Create an array to store char values and then print those in reverse order

        char[] boss = {'O', 'T', 'U', 'A', 'S', 'S', 'O', 'B'};

        for (int i = boss.length - 1; i >= 0; i--) {
            System.out.print(boss[i] + " ");
        }


    }
}
