package class7HW;

public class HWclass7Loops1to100 {
    public static void main(String[] args) {

        //Print numbers from 1 to 100 in 1 line with space
        //3 ways listed

        for (int num = 1; num <= 100; num++) {
            System.out.print(num + " ");
        }

        System.out.println();

        int i = 1;
        while (i < 101) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int n = 1;
        do {
            System.out.print(n + " ");
            n++;
        } while (n <= 100);


    }
}
