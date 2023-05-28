package class7HW;

import java.io.FilterOutputStream;

public class HWclass7LoopsEven20to100 {
    public static void main(String[] args) {

        // Print even numbers from 20 to 1 (2 ways)

        int e = 20;
        while (e >= 1) {
            System.out.println(e);
            e -= 2;
        }

        System.out.println();

        for (int n = 20; n >= 1; n -= 2) {
            System.out.println(n);

        }

        System.out.println();

        int w = 20;
        do {
            System.out.println(w);
            w -= 2;
        } while (w >= 1);


    }
}
