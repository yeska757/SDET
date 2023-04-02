package class7HW;

public class HWclass7LoopsOdd20to50 {
    public static void main(String[] args) {

        //   Print odd numbers between 20 and 50 (2 ways)

        int o = 21;
        while (o <= 50) {
            System.out.println(o);
            o += 2;
        }

        System.out.println();

        for (int d = 21; d < 50; d += 2) {
            System.out.println(d);
        }

        System.out.println();

        int n = 21;
        do {
            System.out.println(n);
            n += 2;
        } while (n < 50);


    }
}
