package class7HW;

public class HWclass7Loops100to1 {
    public static void main(String[] args) {

        //Print numbers from 100 to 1

        int z = 100;
        while (z >= 1) {
            System.out.println(z);
            z--;
        }

        System.out.println();

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        int x = 100;
        do {
            System.out.println(x);
            x--;
        } while (x >= 1);

    }
}
